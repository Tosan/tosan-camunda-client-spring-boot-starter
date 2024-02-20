package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.camundaclient.generated.api.DeploymentApi;
import com.tosan.camunda.camundaclient.generated.api.MessageApi;
import com.tosan.camunda.camundaclient.generated.api.ProcessDefinitionApi;
import com.tosan.camunda.camundaclient.generated.api.ProcessInstanceApi;
import com.tosan.camunda.camundaclient.generated.model.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
@SpringBootApplication
public class CamundaClientApplication implements CommandLineRunner {

    private final MessageApi messageApi;
    private final DeploymentApi deploymentApi;
    private final ProcessDefinitionApi processDefinitionApi;
    private final ProcessInstanceApi processInstanceApi;

    public CamundaClientApplication(MessageApi messageApi, DeploymentApi deploymentApi,
                                    ProcessDefinitionApi processDefinitionApi, ProcessInstanceApi processInstanceApi) {
        this.messageApi = messageApi;
        this.deploymentApi = deploymentApi;
        this.processDefinitionApi = processDefinitionApi;
        this.processInstanceApi = processInstanceApi;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(CamundaClientApplication.class)
                .web(WebApplicationType.SERVLET)
                .build()
                .run();
    }

    @Override
    public void run(String... args) throws IOException {
        deployBpmn("process");
        String businessKey = UUID.randomUUID().toString();
        String processInstanceId = startInstanceWithMessage(businessKey);
        deployBpmn("SimpleProcess");
        startInstance();
        countInstanceByBusinessKey(businessKey);
        modifyProcessInstance(processInstanceId);
    }

    private void countInstanceByBusinessKey(String businessKey) {
        ResponseEntity<CountResultDto> processInstancesCount = processInstanceApi.getProcessInstancesCount(
                null, businessKey, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null);
        System.out.println("processCount: " + processInstancesCount.getBody().getCount());
    }

    private void startInstance() {
        StartProcessInstanceDto body = new StartProcessInstanceDto();
        body.setBusinessKey(UUID.randomUUID().toString());
        ResponseEntity<ProcessInstanceWithVariablesDto> simpleProcess = processDefinitionApi.
                startProcessInstanceByKey("SimpleProcess", body);
    }

    private void deployBpmn(String processName) throws IOException {
        String fileName = processName + ".bpmn";
        InputStream inputStream = getFileFromResourceAsStream(fileName);
        File outFile = new File("\\tmp\\file.bpmn");
        FileItem fileItem = new DiskFileItem(fileName, "multipart/form-data", false,
                fileName, inputStream.available(), outFile);
        IOUtils.copy(inputStream, fileItem.getOutputStream());
        MultipartFile data = new CommonsMultipartFile(fileItem);
        deploymentApi.createDeployment(null, "testApplication", true, true,
                processName, OffsetDateTime.now(), data);
    }

    private String startInstanceWithMessage(String businessKey) {
        CorrelationMessageDto correlationMessageDto = new CorrelationMessageDto();
        correlationMessageDto.setBusinessKey(businessKey);
        correlationMessageDto.setMessageName("test_message");
        correlationMessageDto.setResultEnabled(true);
        correlationMessageDto.setVariablesInResultEnabled(true);
        Map<String, VariableValueDto> processVariables = new HashMap<>();
        VariableValueDto variableValueDto = new VariableValueDto();
        variableValueDto.setValue("testState");
        variableValueDto.setType("String");
        processVariables.put("startState", variableValueDto);
        correlationMessageDto.setProcessVariables(processVariables);
        ResponseEntity<List<MessageCorrelationResultWithVariableDto>> entity =
                messageApi.deliverMessage(correlationMessageDto);
        System.out.println("entity = " + entity);
        return Objects.requireNonNull(entity.getBody()).get(0).getProcessInstance().getId();
    }

    private InputStream getFileFromResourceAsStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }

    private void modifyProcessInstance(String processInstanceId) {
        List<ProcessInstanceModificationInstructionDto> instructions = List.of(
                new ProcessInstanceModificationInstructionDto()
                        .type(ProcessInstanceModificationInstructionDto.TypeEnum.STARTBEFOREACTIVITY)
                        .activityId("Activity_userTaskTwo")
                        .variables(Map.of(
                                        "variable-one", new TriggerVariableValueDto()
                                                .value("value-one")
                                                .local(Boolean.FALSE) // instance variable scope
                                                .type("string"),
                                        "variable-two", new TriggerVariableValueDto()
                                                .value("true")
                                                .local(Boolean.TRUE) // activity variable scope
                                                .type("boolean")
                                )
                        ),
                new ProcessInstanceModificationInstructionDto()
                        .type(ProcessInstanceModificationInstructionDto.TypeEnum.CANCEL)
                        .activityId("Activity_userTaskOne")
        );
        ProcessInstanceModificationDto processInstanceModificationDto = new ProcessInstanceModificationDto()
                .annotation("process modification description")
                .instructions(instructions);
        processInstanceApi.modifyProcessInstance(processInstanceId, processInstanceModificationDto);
    }

}
