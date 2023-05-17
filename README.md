# tosan-camunda-client-spring-boot-starter

This project provides a complete external task Spring-Boot Starter that contains extra features
over camunda external tasks starter and also provides a camunda rest client using camunda openApi JSON
and tosan-httpclient-feign-spring-boot-starter.

## ⭐ Usage
The main purpose of `tosan-camunda-client-spring-boot-starter` is to provide a complete camunda client to work with
camunda server with external model, and a complete rest client to call camunda rest api easily. this tool use 
camunda-bpm-spring-boot-starter-external-task-client and provide extra features such as exception handling, 
external worker logging and the most important, a rest client based official camunda openApi json.

```
<dependency>
  <groupId>com.tosan.camunda</groupId>
  <artifactId>tosan-camunda-client-spring-boot-starter</artifactId>
  <version>${version}</version>
</dependency>
```
you can also use api module alone if needed.

```
<dependency>
  <groupId>com.tosan.camunda</groupId>
  <artifactId>tosan-camunda-client-api</artifactId>
  <version>${version}</version>
</dependency>
```

## 🚀 external task client
This project consists of two main parts, one of which is camunda-external-task-client. All configuration of external client are described in [external-client](https://docs.camunda.org/manual/7.16/user-guide/ext-client/spring-boot-starter/).
this project adds two main feature to external task client. first of all exception handling and retry policy for technical exceptions in external tasks and second of all adding extra logs and mdc parameters to external worker activity in order to easily find logs related to single process instance.

### enabling extra features on external task worker
in order to enable aspects provided in this project all external worker classes must implement [ExternalWorker](./tosan-camunda-client-spring-boot-starter/src/main/java/com/tosan/camunda/camundaclient/external/ExternalWorker.java) this interface extends ExternalTaskHandler of camunda-external-task-client so implementing this interface will be enough for external workers. ExternalWorker interface consist of two abstract methods that must be implemented in each external worker. a sample of external worker is provided in [TestExternalWorker](./tosan-camunda-client-test/src/main/java/com/tosan/camunda/camundaclient/test/TestExternalWorker.java) .
abstract methods consist of:

> execute : business logic must be implemented in this method.

> getWorker: worker name must be provided in this method.(you can find a sample of implementation of this interface in [TestExternalWorker](./tosan-camunda-client-test/src/main/java/com/tosan/camunda/camundaclient/test/WorkerType.java))

ExternalWorker interface also include getExternalTaskInfo default method which returns the ExternalTaskInfo related to 
that specific external task. you can add variables to your external task as below:
```
ExternalTaskInfo externalTaskInfo = getExternalTaskInfo(externalTask);
Map<String, Object> variables = externalTaskInfo.getVariables();
variables.put("test", "test");
variables.put("startState", "changedState");
```
added variables will be sent to camunda server automatically in case of task complete and handleFailure.
in order to pass variables in handleBpmnError you can pass variables like example:
```
externalTaskService.handleBpmnError(externalTask, e.getClass().getSimpleName(), e.getMessage(), variables);
```

external worker sample:
```
@Component
@ExternalTaskSubscription(
        topicName = "testTopic",
        processDefinitionKey = "process",
        includeExtensionProperties = true
)
public class TestExternalWorker implements ExternalWorker {
    @Override
    public Worker getWorker() {
        return WorkerType.TEST_WORKER;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        ExternalTaskInfo externalTaskInfo = getExternalTaskInfo(externalTask);
        Map<String, Object> variables = externalTaskInfo.getVariables();
        variables.put("test", "test");
        variables.put("startState", "changedState");
        try {
            handleExecution();
        } catch (CamundaClientTestException e) {
            externalTaskService.handleBpmnError(externalTask, e.getClass().getSimpleName(), e.getMessage(), variables);
        }
    }

    private void handleExecution() throws CamundaClientTestException {
        //business here
        System.out.println("business handled successfully");
    }
}

```
### external worker exception handling
based on camunda document two type of error is known to camunda server, business and technical error. for more information about these to types you can refer to [camunda-error-types](https://docs.camunda.org/manual/7.16/user-guide/process-engine/error-handling/)
all business errors must be handled as below:
```
public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        try {
            handleExecution();
        } catch (CamundaClientTestException e) {
            externalTaskService.handleBpmnError(externalTask, e.getClass().getSimpleName());
        }
}
```
it's better to define business errors as checked exception because it helps you to be notified that this exception  exist in  business and must be handled as above. this model helps you to know exactly what business errors occurs in worker in order to define boundary error event for tasks that have business error. 

if worker execution complete successfully, complete signal will be sent to camunda engine automatically by camunda client aspects(there is no need to call externalService complete method).
also if technical error occur in execution that haven't been handled in any catch block it will be handled by camunda client aspects(no need to handle technical exceptions in your worker).
raised exception must have implemented [CamundaClientRuntimeIncident](./tosan-camunda-client-api/src/main/java/com/tosan/camunda/api/CamundaClientRuntimeIncident.java). this interface consist of an abstract method (getExceptionIncidentState) that indicates if exception is repeatable or non_repeatable. if exception is non_repeatable type, number of retries will be set to 0 and it will change to incident immediately. otherwise it will be retried based on properties provided as below:

>camunda.bpm.client.retry.retry-count=3 //indicates max number of retries for repeatable exceptions

>camunda.bpm.client.retry.retry-interval=100000 //indicated interval between next retry in milliseconds

```
public class CamundaClientTestRuntimeException extends RuntimeException implements CamundaClientRuntimeIncident {
    @Override
    public ExceptionIncidentState getExceptionIncidentState() {
        return ExceptionIncidentState.REPEATABLE;
    }
}
```

if exception has not implemented CamundaClientRuntimeIncident interface it will change into incident immediately.

### extra log for external worker
this library adds extra information to MDC on each instance startup. these keys will be added to MDC at worker excustion startup and will be cleaned after method execution:

> business-key: business key of process instance.

> worker : worker name.

in order to use these parameters you have to define it in logback.xml file. a logback.xml sample is provided in [logback.xml](./tosan-camunda-client-test/src/main/resources/logback.xml). these parameters will be really useful on connecting project to ELK and receiving the whole request log including worker logs by businessKey provided in MDC.

two extra logs will be rolled on start and end of worker task as below:
```
{
  "executionState" : "START",
  "worker" : "TEST_WORKER",
  "processInstanceId" : "f2bf2eb3-7d1a-11ec-a50e-9c5a4497ad45",
  "businessKey" : "mina111",
  "variables" : { }
}
{
  "executionState" : "FAIL",
  "worker" : "TEST_WORKER",
  "processInstanceId" : "f2359779-7d1b-11ec-a8af-9c5a4497ad45",
  "businessKey" : "mina111",
  "variables" : { }
} 
```

worker name in above log will be provided from getWorker method:
```
    @Override
    public Worker getWorker() {
        return WorkerType.TEST_WORKER;
    }
```

## 🚀 camunda rest client
there are other camunda rest services such as messageApi or deploymentApi that camunda-external client doesn't cover but usually need to be used in external project. this project provide a rest client based on camunda official openApi json and  creates rest client for these restControllers with tosan-httpclient-feign-spring-boot-starter project.
in order to call a rest service you can easily inject selected api into your class and call each method with proper inputs.
to see a sample of calling camunda rest services refer to [CamundaClientApplication](./tosan-camunda-client-test/src/main/java/com/tosan/camunda/camundaclient/test/CamundaClientApplication.java)
 
```
@Autowired
private MessageApi messageApi;

private void startInstance() {
        CorrelationMessageDto correlationMessageDto = new CorrelationMessageDto();
        correlationMessageDto.setBusinessKey("1234");
        correlationMessageDto.setMessageName("test_message");
        ResponseEntity<List<MessageCorrelationResultWithVariableDto>> entity =
                messageApi.deliverMessage(correlationMessageDto);
        System.out.println("entity = " + entity);
}
```

rest client will be connected to camunda server defined in below property:
> camunda.bpm.client.base-url=http://localhost:8094/camunda/engine-rest

it also have these two properties for connection timeout and request timeout in milliseconds

> camunda.bpm.client.rest-service-config.connection-timeout=60000 //connection timeout for rest services

> camunda.bpm.client.rest-service-config.request-timeout=60000  //request timeout for rest services

provided apis as far is as below:

> MessageApi

> DeploymentApi

> ExecutionApi

> ExternalTaskApi

> HistoricActivityInstanceApi

> HistoricDetailApi

> HistoricExternalTaskLogApi

> HistoricIncidentApi

> HistoricProcessInstanceApi

> IncidentApi

> MetricsApi

> MigrationApi

> ProcessDefinitionApi

> ProcessInstanceApi

> VariableInstanceApi

> AuthorizationApi

> BatchApi

> ConditionApi

> DecisionDefinitionApi

> DecisionRequirementsDefinitionApi

> EngineApi

> EventSubscriptionApi

> FilterApi

> GroupApi

> HistoricBatchApi

> HistoricDecisionDefinitionApi

> HistoricDecisionInstanceApi

> HistoricDecisionRequirementsDefinitionApi

> HistoricIdentityLinkLogApi

> HistoricJobLogApi

> HistoricProcessDefinitionApi

> HistoricTaskInstanceApi

> HistoricUserOperationLogApi

> HistoricVariableInstanceApi

> HistoryCleanupApi

> IdentityApi

> JobApi

> JobDefinitionApi

> ModificationApi

> SchemaLogApi

> SignalApi

> TaskApi

> TaskAttachmentApi

> TaskCommentApi

> TaskIdentityLinkApi

> TaskLocalVariableApi

> TaskVariableApi

> TelemetryApi

> TenantApi

> UserApi

> VersionApi

other apis can be added easily via [CamundaServiceConfig](./tosan-camunda-client-spring-boot-starter/src/main/java/com/tosan/camunda/camundaclient/CamundaServiceConfig.java)

### Sample Project

You can find a sample project in tosan-camunda-client-test module

### Prerequisites
This Library requires java version 17 or above and spring boot version 3 and above.

## Contributing
Any contribution is greatly appreciated.
If you have a suggestion that would make this project better, please fork the repo and create a pull request.
You can also simply open an issue with the tag "enhancement".

## License
The source files in this repository are available under the [Apache License Version 2.0](./LICENSE.txt).
