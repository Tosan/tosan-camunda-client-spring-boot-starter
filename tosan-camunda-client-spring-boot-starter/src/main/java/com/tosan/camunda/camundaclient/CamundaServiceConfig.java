package com.tosan.camunda.camundaclient;

import com.tosan.camunda.camundaclient.generated.api.*;
import com.tosan.client.http.core.HttpClientProperties;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoder;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.slf4j.Slf4jLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
@Slf4j
@EnableFeignClients
public class CamundaServiceConfig extends CamundaEngineClientConfig {

    @Override
    @Bean("camunda-client-feignBuilder")
    public Feign.Builder feignBuilder(@Qualifier("camunda-client-feignClient") Client feignClient,
                                      @Qualifier("camunda-client-feignOption") Request.Options options,
                                      @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                      @Qualifier("camunda-client-feignContract") Contract feignContract,
                                      @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                      @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                      @Qualifier("camunda-client-retryer") Retryer retryer,
                                      @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                      @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder,
                                      @Qualifier("camunda-client-httpFeignClientLogger") Logger logger) {
        return super.feignBuilder(feignClient, options, requestInterceptors, feignContract, feignDecoder, feignEncoder,
                retryer, logLevel, errorDecoder, logger);
    }

    @Bean
    public MessageApi messageServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                           @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                MessageApi.class);
    }

    @Bean
    public DeploymentApi deploymentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                 @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                DeploymentApi.class);
    }

    @Bean
    public ExecutionApi executionServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                               @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ExecutionApi.class);
    }

    @Bean
    public ExternalTaskApi externalTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                     @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ExternalTaskApi.class);
    }

    @Bean
    public HistoricActivityInstanceApi historicActivityInstanceTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                 @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricActivityInstanceApi.class);
    }

    @Bean
    public HistoricDetailApi historicDetailTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricDetailApi.class);
    }

    @Bean
    public HistoricExternalTaskLogApi historicExternalTaskLogServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricExternalTaskLogApi.class);
    }

    @Bean
    public HistoricIncidentApi historicIncidentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricIncidentApi.class);
    }

    @Bean
    public HistoricProcessInstanceApi historicProcessInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricProcessInstanceApi.class);
    }

    @Bean
    public IncidentApi incidentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                             @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                IncidentApi.class);
    }

    @Bean
    public MetricsApi metricsServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                           @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                MetricsApi.class);
    }

    @Bean
    public MigrationApi migrationServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                               @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                MigrationApi.class);
    }

    @Bean
    public ProcessDefinitionApi processDefinitionServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                               @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ProcessDefinitionApi.class);
    }

    @Bean
    public ProcessInstanceApi processInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                           @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ProcessInstanceApi.class);
    }

    @Bean
    public VariableInstanceApi variableInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                VariableInstanceApi.class);
    }

    @Bean
    public AuthorizationApi authorizeApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                      @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                AuthorizationApi.class);
    }

    @Bean
    public BatchApi batchApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                          @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                BatchApi.class);
    }

    @Bean
    public ConditionApi conditionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ConditionApi.class);
    }

    @Bean
    public DecisionDefinitionApi decisionDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                    @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                DecisionDefinitionApi.class);
    }

    @Bean
    public DecisionRequirementsDefinitionApi decisionRequirementsDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                DecisionRequirementsDefinitionApi.class);
    }

    @Bean
    public EngineApi engineApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                EngineApi.class);
    }

    @Bean
    public EventSubscriptionApi eventSubscriptionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                EventSubscriptionApi.class);
    }

    @Bean
    public FilterApi filterApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                FilterApi.class);
    }

    @Bean
    public GroupApi groupApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                          @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                GroupApi.class);
    }

    @Bean
    public HistoricBatchApi historicBatchApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                          @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricBatchApi.class);
    }

    @Bean
    public HistoricDecisionDefinitionApi historicDecisionDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                    @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricDecisionDefinitionApi.class);
    }

    @Bean
    public HistoricDecisionInstanceApi historicDecisionInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricDecisionInstanceApi.class);
    }

    @Bean
    public HistoricDecisionRequirementsDefinitionApi historicDecisionRequirementsDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricDecisionRequirementsDefinitionApi.class);
    }

    @Bean
    public HistoricIdentityLinkLogApi historicIdentityLinkLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                              @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricIdentityLinkLogApi.class);
    }

    @Bean
    public HistoricJobLogApi historicJobLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricJobLogApi.class);
    }

    @Bean
    public HistoricProcessDefinitionApi historicProcessDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricProcessDefinitionApi.class);
    }

    @Bean
    public HistoricTaskInstanceApi historicTaskInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                        @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricTaskInstanceApi.class);
    }

    @Bean
    public HistoricUserOperationLogApi historicUserOperationLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricUserOperationLogApi.class);
    }

    @Bean
    public HistoricVariableInstanceApi historicVariableInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoricVariableInstanceApi.class);
    }

    @Bean
    public HistoryCleanupApi historyCleanupApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                HistoryCleanupApi.class);
    }

    @Bean
    public IdentityApi identityApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                IdentityApi.class);
    }

    @Bean
    public JobApi jobApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                      @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                JobApi.class);
    }

    @Bean
    public JobDefinitionApi jobDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                          @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                JobDefinitionApi.class);
    }

    @Bean
    public ModificationApi modificationApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                        @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                ModificationApi.class);
    }

    @Bean
    public SchemaLogApi schemaLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                SchemaLogApi.class);
    }

    @Bean
    public SignalApi signalApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                SignalApi.class);
    }

    @Bean
    public TaskApi taskApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                        @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskApi.class);
    }

    @Bean
    public TaskAttachmentApi taskAttachmentApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskAttachmentApi.class);
    }

    @Bean
    public TaskCommentApi taskCommentApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                      @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskCommentApi.class);
    }

    @Bean
    public TaskIdentityLinkApi taskIdentityLinkApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskIdentityLinkApi.class);
    }

    @Bean
    public TaskLocalVariableApi taskLocalVariableApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskLocalVariableApi.class);
    }

    @Bean
    public TaskVariableApi taskVariableApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                        @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TaskVariableApi.class);
    }

    @Bean
    public TelemetryApi telemetryApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TelemetryApi.class);
    }

    @Bean
    public TenantApi tenantApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                TenantApi.class);
    }

    @Bean
    public UserApi userApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                        @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                UserApi.class);
    }

    @Bean
    public VersionApi versionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                              @Qualifier("camunda-client-feignBuilder") Feign.Builder feignBuilder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), feignBuilder,
                VersionApi.class);
    }
}
