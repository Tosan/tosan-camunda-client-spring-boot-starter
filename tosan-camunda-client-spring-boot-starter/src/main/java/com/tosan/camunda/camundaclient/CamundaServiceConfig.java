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

    @Bean
    public MessageApi messageServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                           @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                           @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                           @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                MessageApi.class, new Slf4jLogger(MessageApi.class));
    }

    @Bean
    public DeploymentApi deploymentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                 @Qualifier("camunda-client-feignClient") Client feignClient,
                                                 @Qualifier("camunda-client-feignOption") Request.Options options,
                                                 @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                 @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                 @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                 @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                 @Qualifier("camunda-client-retryer") Retryer retryer,
                                                 @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                 @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                DeploymentApi.class, new Slf4jLogger(DeploymentApi.class));
    }

    @Bean
    public ExecutionApi executionServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                               @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                               @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                               @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ExecutionApi.class, new Slf4jLogger(ExecutionApi.class));
    }

    @Bean
    public ExternalTaskApi externalTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                     @Qualifier("camunda-client-feignClient") Client feignClient,
                                                     @Qualifier("camunda-client-feignOption") Request.Options options,
                                                     @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                     @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                     @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                     @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                     @Qualifier("camunda-client-retryer") Retryer retryer,
                                                     @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                     @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ExternalTaskApi.class, new Slf4jLogger(ExternalTaskApi.class));
    }

    @Bean
    public HistoricActivityInstanceApi historicActivityInstanceTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                 @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                 @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                 @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                 @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                 @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                 @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                 @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                 @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                 @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricActivityInstanceApi.class, new Slf4jLogger(HistoricActivityInstanceApi.class));
    }

    @Bean
    public HistoricDetailApi historicDetailTaskServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                             @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricDetailApi.class, new Slf4jLogger(HistoricDetailApi.class));
    }

    @Bean
    public HistoricExternalTaskLogApi historicExternalTaskLogServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                           @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                           @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                           @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricExternalTaskLogApi.class, new Slf4jLogger(HistoricExternalTaskLogApi.class));
    }

    @Bean
    public HistoricIncidentApi historicIncidentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                             @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricIncidentApi.class, new Slf4jLogger(HistoricIncidentApi.class));
    }

    @Bean
    public HistoricProcessInstanceApi historicProcessInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                           @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                           @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                           @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricProcessInstanceApi.class, new Slf4jLogger(HistoricProcessInstanceApi.class));
    }

    @Bean
    public IncidentApi incidentServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                             @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                             @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                             @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                IncidentApi.class, new Slf4jLogger(IncidentApi.class));
    }

    @Bean
    public MetricsApi metricsServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                           @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                           @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                           @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                MetricsApi.class, new Slf4jLogger(MetricsApi.class));
    }

    @Bean
    public MigrationApi migrationServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                               @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                               @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                               @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                MigrationApi.class, new Slf4jLogger(MigrationApi.class));
    }

    @Bean
    public ProcessDefinitionApi processDefinitionServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                                               @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                               @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                               @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ProcessDefinitionApi.class, new Slf4jLogger(ProcessDefinitionApi.class));
    }

    @Bean
    public ProcessInstanceApi processInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                           @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                           @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                           @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ProcessInstanceApi.class, new Slf4jLogger(ProcessInstanceApi.class));
    }

    @Bean
    public VariableInstanceApi variableInstanceServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                             @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                VariableInstanceApi.class, new Slf4jLogger(VariableInstanceApi.class));
    }

    @Bean
    public AuthorizationApi authorizeApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                      @Qualifier("camunda-client-feignClient") Client feignClient,
                                                      @Qualifier("camunda-client-feignOption") Request.Options options,
                                                      @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                      @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                      @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                      @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                      @Qualifier("camunda-client-retryer") Retryer retryer,
                                                      @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                      @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                AuthorizationApi.class, new Slf4jLogger(AuthorizationApi.class));
    }

    @Bean
    public BatchApi batchApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                          @Qualifier("camunda-client-feignClient") Client feignClient,
                                          @Qualifier("camunda-client-feignOption") Request.Options options,
                                          @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                          @Qualifier("camunda-client-feignContract") Contract feignContract,
                                          @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                          @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                          @Qualifier("camunda-client-retryer") Retryer retryer,
                                          @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                          @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                BatchApi.class, new Slf4jLogger(BatchApi.class));
    }

    @Bean
    public ConditionApi conditionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ConditionApi.class, new Slf4jLogger(ConditionApi.class));
    }

    @Bean
    public DecisionDefinitionApi decisionDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                    @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                    @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                    @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                    @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                    @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                    @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                    @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                    @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                    @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                DecisionDefinitionApi.class, new Slf4jLogger(DecisionDefinitionApi.class));
    }

    @Bean
    public DecisionRequirementsDefinitionApi decisionRequirementsDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                DecisionRequirementsDefinitionApi.class, new Slf4jLogger(DecisionRequirementsDefinitionApi.class));
    }

    @Bean
    public EngineApi engineApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                EngineApi.class, new Slf4jLogger(EngineApi.class));
    }

    @Bean
    public EventSubscriptionApi eventSubscriptionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                EventSubscriptionApi.class, new Slf4jLogger(EventSubscriptionApi.class));
    }

    @Bean
    public FilterApi filterApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                FilterApi.class, new Slf4jLogger(FilterApi.class));
    }

    @Bean
    public GroupApi groupApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                          @Qualifier("camunda-client-feignClient") Client feignClient,
                                          @Qualifier("camunda-client-feignOption") Request.Options options,
                                          @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                          @Qualifier("camunda-client-feignContract") Contract feignContract,
                                          @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                          @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                          @Qualifier("camunda-client-retryer") Retryer retryer,
                                          @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                          @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                GroupApi.class, new Slf4jLogger(GroupApi.class));
    }

    @Bean
    public HistoricBatchApi historicBatchApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                          @Qualifier("camunda-client-feignClient") Client feignClient,
                                                          @Qualifier("camunda-client-feignOption") Request.Options options,
                                                          @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                          @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                          @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                          @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                          @Qualifier("camunda-client-retryer") Retryer retryer,
                                                          @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                          @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricBatchApi.class, new Slf4jLogger(HistoricBatchApi.class));
    }

    @Bean
    public HistoricDecisionDefinitionApi historicDecisionDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                    @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                    @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                    @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                    @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                    @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                    @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                    @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                    @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                    @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricDecisionDefinitionApi.class, new Slf4jLogger(HistoricDecisionDefinitionApi.class));
    }

    @Bean
    public HistoricDecisionInstanceApi historicDecisionInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricDecisionInstanceApi.class, new Slf4jLogger(HistoricDecisionInstanceApi.class));
    }

    @Bean
    public HistoricDecisionRequirementsDefinitionApi historicDecisionRequirementsDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricDecisionRequirementsDefinitionApi.class, new Slf4jLogger(HistoricDecisionRequirementsDefinitionApi.class));
    }

    @Bean
    public HistoricIdentityLinkLogApi historicIdentityLinkLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                              @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                              @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                              @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                              @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                              @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                              @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                              @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                              @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                              @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricIdentityLinkLogApi.class, new Slf4jLogger(HistoricIdentityLinkLogApi.class));
    }

    @Bean
    public HistoricJobLogApi historicJobLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricJobLogApi.class, new Slf4jLogger(HistoricJobLogApi.class));
    }

    @Bean
    public HistoricProcessDefinitionApi historicProcessDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricProcessDefinitionApi.class, new Slf4jLogger(HistoricProcessDefinitionApi.class));
    }

    @Bean
    public HistoricTaskInstanceApi historicTaskInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                        @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                        @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                        @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                        @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                        @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                        @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                        @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                        @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                        @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricTaskInstanceApi.class, new Slf4jLogger(HistoricTaskInstanceApi.class));
    }

    @Bean
    public HistoricUserOperationLogApi historicUserOperationLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricUserOperationLogApi.class, new Slf4jLogger(HistoricUserOperationLogApi.class));
    }

    @Bean
    public HistoricVariableInstanceApi historicVariableInstanceApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                                @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                                @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                                @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                                @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoricVariableInstanceApi.class, new Slf4jLogger(HistoricVariableInstanceApi.class));
    }

    @Bean
    public HistoryCleanupApi historyCleanupApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                HistoryCleanupApi.class, new Slf4jLogger(HistoryCleanupApi.class));
    }

    @Bean
    public IdentityApi identityApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                @Qualifier("camunda-client-feignClient") Client feignClient,
                                                @Qualifier("camunda-client-feignOption") Request.Options options,
                                                @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                @Qualifier("camunda-client-retryer") Retryer retryer,
                                                @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                IdentityApi.class, new Slf4jLogger(IdentityApi.class));
    }

    @Bean
    public JobApi jobApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                      @Qualifier("camunda-client-feignClient") Client feignClient,
                                      @Qualifier("camunda-client-feignOption") Request.Options options,
                                      @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                      @Qualifier("camunda-client-feignContract") Contract feignContract,
                                      @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                      @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                      @Qualifier("camunda-client-retryer") Retryer retryer,
                                      @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                      @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                JobApi.class, new Slf4jLogger(JobApi.class));
    }

    @Bean
    public JobDefinitionApi jobDefinitionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                          @Qualifier("camunda-client-feignClient") Client feignClient,
                                                          @Qualifier("camunda-client-feignOption") Request.Options options,
                                                          @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                          @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                          @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                          @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                          @Qualifier("camunda-client-retryer") Retryer retryer,
                                                          @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                          @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                JobDefinitionApi.class, new Slf4jLogger(JobDefinitionApi.class));
    }

    @Bean
    public ModificationApi modificationApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                        @Qualifier("camunda-client-feignClient") Client feignClient,
                                                        @Qualifier("camunda-client-feignOption") Request.Options options,
                                                        @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                        @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                        @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                        @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                        @Qualifier("camunda-client-retryer") Retryer retryer,
                                                        @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                        @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                ModificationApi.class, new Slf4jLogger(ModificationApi.class));
    }

    @Bean
    public SchemaLogApi schemaLogApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                SchemaLogApi.class, new Slf4jLogger(SchemaLogApi.class));
    }

    @Bean
    public SignalApi signalApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                SignalApi.class, new Slf4jLogger(SignalApi.class));
    }

    @Bean
    public TaskApi taskApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                        @Qualifier("camunda-client-feignClient") Client feignClient,
                                        @Qualifier("camunda-client-feignOption") Request.Options options,
                                        @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                        @Qualifier("camunda-client-feignContract") Contract feignContract,
                                        @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                        @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                        @Qualifier("camunda-client-retryer") Retryer retryer,
                                        @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                        @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskApi.class, new Slf4jLogger(TaskApi.class));
    }

    @Bean
    public TaskAttachmentApi taskAttachmentApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskAttachmentApi.class, new Slf4jLogger(TaskAttachmentApi.class));
    }

    @Bean
    public TaskCommentApi taskCommentApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                      @Qualifier("camunda-client-feignClient") Client feignClient,
                                                      @Qualifier("camunda-client-feignOption") Request.Options options,
                                                      @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                      @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                      @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                      @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                      @Qualifier("camunda-client-retryer") Retryer retryer,
                                                      @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                      @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskCommentApi.class, new Slf4jLogger(TaskCommentApi.class));
    }

    @Bean
    public TaskIdentityLinkApi taskIdentityLinkApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskIdentityLinkApi.class, new Slf4jLogger(TaskIdentityLinkApi.class));
    }

    @Bean
    public TaskLocalVariableApi taskLocalVariableApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskLocalVariableApi.class, new Slf4jLogger(TaskLocalVariableApi.class));
    }

    @Bean
    public TaskVariableApi taskVariableApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                        @Qualifier("camunda-client-feignClient") Client feignClient,
                                                        @Qualifier("camunda-client-feignOption") Request.Options options,
                                                        @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                        @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                        @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                        @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                        @Qualifier("camunda-client-retryer") Retryer retryer,
                                                        @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                        @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TaskVariableApi.class, new Slf4jLogger(TaskVariableApi.class));
    }

    @Bean
    public TelemetryApi telemetryApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                                  @Qualifier("camunda-client-feignClient") Client feignClient,
                                                  @Qualifier("camunda-client-feignOption") Request.Options options,
                                                  @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                                  @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                  @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                                  @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                                  @Qualifier("camunda-client-retryer") Retryer retryer,
                                                  @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                  @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TelemetryApi.class, new Slf4jLogger(TelemetryApi.class));
    }

    @Bean
    public TenantApi tenantApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                            @Qualifier("camunda-client-feignClient") Client feignClient,
                                            @Qualifier("camunda-client-feignOption") Request.Options options,
                                            @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                            @Qualifier("camunda-client-feignContract") Contract feignContract,
                                            @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                            @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                            @Qualifier("camunda-client-retryer") Retryer retryer,
                                            @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                            @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                TenantApi.class, new Slf4jLogger(TenantApi.class));
    }

    @Bean
    public UserApi userApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                        @Qualifier("camunda-client-feignClient") Client feignClient,
                                        @Qualifier("camunda-client-feignOption") Request.Options options,
                                        @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                        @Qualifier("camunda-client-feignContract") Contract feignContract,
                                        @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                        @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                        @Qualifier("camunda-client-retryer") Retryer retryer,
                                        @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                        @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                UserApi.class, new Slf4jLogger(UserApi.class));
    }

    @Bean
    public VersionApi versionApiServiceClient(@Qualifier("camunda-client-clientConfig") HttpClientProperties camundaFeignConfig,
                                              @Qualifier("camunda-client-feignClient") Client feignClient,
                                              @Qualifier("camunda-client-feignOption") Request.Options options,
                                              @Qualifier("camunda-client-requestInterceptor") List<RequestInterceptor> requestInterceptors,
                                              @Qualifier("camunda-client-feignContract") Contract feignContract,
                                              @Qualifier("camunda-client-feignDecoder") Decoder feignDecoder,
                                              @Qualifier("camunda-client-feignEncoder") Encoder feignEncoder,
                                              @Qualifier("camunda-client-retryer") Retryer retryer,
                                              @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                              @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        return super.getFeignController(camundaFeignConfig.getBaseServiceUrl(), super.feignBuilder(feignClient, options,
                        requestInterceptors, feignContract, feignDecoder, feignEncoder, retryer, logLevel, errorDecoder),
                VersionApi.class, new Slf4jLogger(VersionApi.class));
    }
}
