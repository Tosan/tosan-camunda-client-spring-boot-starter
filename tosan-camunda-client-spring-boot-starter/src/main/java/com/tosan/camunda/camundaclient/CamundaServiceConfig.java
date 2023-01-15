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
}
