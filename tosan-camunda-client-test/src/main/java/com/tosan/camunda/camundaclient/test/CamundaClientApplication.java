package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.camundaclient.generated.api.DeploymentApi;
import com.tosan.camunda.camundaclient.generated.api.MessageApi;
import com.tosan.camunda.camundaclient.generated.api.ProcessDefinitionApi;
import com.tosan.camunda.camundaclient.generated.api.VariableInstanceApi;
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
import org.springframework.web.multipart.commons.CommonsMultipartFile;

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

    private MessageApi messageApi;
    private DeploymentApi deploymentApi;
    private ProcessDefinitionApi processDefinitionApi;

    private VariableInstanceApi variableInstanceApi;

    public CamundaClientApplication(MessageApi messageApi, DeploymentApi deploymentApi, ProcessDefinitionApi processDefinitionApi,
                                    VariableInstanceApi variableInstanceApi) {
        this.messageApi = messageApi;
        this.deploymentApi = deploymentApi;
        this.processDefinitionApi = processDefinitionApi;
        this.variableInstanceApi = variableInstanceApi;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(CamundaClientApplication.class)
                .web(WebApplicationType.SERVLET)
                .build()
                .run();
    }

    @Override
    public void run(String... args) throws IOException {
        /*deployBpmn("process", "1234");
        startInstanceWithMessage();
        deployBpmn("SimpleProcess", null);
        startInstance();*/
        getVariables();
    }

    private void getVariables() {
        VariableInstanceQueryDto body = new VariableInstanceQueryDto();
        ArrayList<String> processInstanceIdIn = new ArrayList<>();
        processInstanceIdIn.add("677ccfaa-ce8c-11ee-8603-68ecc5b246a8");
        body.setProcessInstanceIdIn(processInstanceIdIn);
        ResponseEntity<List<VariableInstanceDto>> entity = variableInstanceApi.queryVariableInstances(0,
                Integer.MAX_VALUE, true, body);
        System.out.println("entity = " + entity);
    }

    private void startInstance() {
        StartProcessInstanceDto body = new StartProcessInstanceDto();
        body.setBusinessKey(UUID.randomUUID().toString());
        ResponseEntity<ProcessInstanceWithVariablesDto> simpleProcess = processDefinitionApi.
                startProcessInstanceByKey("SimpleProcess", body);
    }

    private void deployBpmn(String processName, String tenantId) throws IOException {
        String fileName = processName + ".bpmn";
        InputStream inputStream = getFileFromResourceAsStream(fileName);
        File outFile = new File("\\tmp\\file.bpmn");
        FileItem fileItem = new DiskFileItem(fileName, "multipart/form-data", false,
                fileName, inputStream.available(), outFile);
        IOUtils.copy(inputStream, fileItem.getOutputStream());
        MultipartFile data = new CommonsMultipartFile(fileItem);
        deploymentApi.createDeployment("testApplication",tenantId, true, true,
                processName, OffsetDateTime.now(), data);
    }

    private void startInstanceWithMessage() {
        CorrelationMessageDto correlationMessageDto = new CorrelationMessageDto();
        correlationMessageDto.setBusinessKey(UUID.randomUUID().toString());
        correlationMessageDto.setMessageName("test_message");
        Map<String, VariableValueDto> processVariables = new HashMap<>();
        VariableValueDto variableValueDto = new VariableValueDto();
        variableValueDto.setValue("testState");
        variableValueDto.setType("String");
        processVariables.put("startState", variableValueDto);
        correlationMessageDto.setProcessVariables(processVariables);
        ResponseEntity<List<MessageCorrelationResultWithVariableDto>> entity =
                messageApi.deliverMessage(correlationMessageDto);
        System.out.println("entity = " + entity);
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
}
