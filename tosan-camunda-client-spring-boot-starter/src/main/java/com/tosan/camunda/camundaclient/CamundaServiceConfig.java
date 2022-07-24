package com.tosan.camunda.camundaclient;

import com.tosan.camunda.camundaclient.config.CamundaFeignConfig;
import com.tosan.camunda.camundaclient.feign.exception.CamundaClientConfigurationException;
import com.tosan.camunda.camundaclient.generated.api.*;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoder;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.slf4j.Slf4jLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
@Slf4j
@Configuration
@EnableFeignClients
public class CamundaServiceConfig {

    @Bean
    public MessageApi messageServiceClient(CamundaFeignConfig camundaFeignConfig,
                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                           @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                           @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(MessageApi.class))
                .logLevel(logLevel)
                .target(MessageApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public DeploymentApi deploymentServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                 @Qualifier("camunda-client-feignClient") Client feignClient,
                                                 @Qualifier("camunda-client-feignOption") Request.Options options,
                                                 @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                 @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                 @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                 @Qualifier("camunda-client-retryer") Retryer retryer,
                                                 @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                 @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(DeploymentApi.class))
                .logLevel(logLevel)
                .target(DeploymentApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public ExecutionApi executionServiceClient(CamundaFeignConfig camundaFeignConfig,
                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                               @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                               @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(ExecutionApi.class))
                .logLevel(logLevel)
                .target(ExecutionApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public ExternalTaskApi externalTaskServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                     @Qualifier("camunda-client-feignClient") Client feignClient,
                                                     @Qualifier("camunda-client-feignOption") Request.Options options,
                                                     @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                     @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                     @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                     @Qualifier("camunda-client-retryer") Retryer retryer,
                                                     @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                     @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(ExternalTaskApi.class))
                .logLevel(logLevel)
                .target(ExternalTaskApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public HistoricActivityInstanceApi historicActivityInstanceTaskServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                                                 @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                                 @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                                 @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                                 @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                                                 @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                                                 @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                                 @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                                 @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(HistoricActivityInstanceApi.class))
                .logLevel(logLevel)
                .target(HistoricActivityInstanceApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public HistoricDetailApi historicDetailTaskServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                             @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(HistoricDetailApi.class))
                .logLevel(logLevel)
                .target(HistoricDetailApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public HistoricExternalTaskLogApi historicExternalTaskLogServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                           @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                                           @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(HistoricExternalTaskLogApi.class))
                .logLevel(logLevel)
                .target(HistoricExternalTaskLogApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public HistoricIncidentApi historicIncidentServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                             @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(HistoricIncidentApi.class))
                .logLevel(logLevel)
                .target(HistoricIncidentApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public HistoricProcessInstanceApi historicProcessInstanceServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                                           @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                                           @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(HistoricProcessInstanceApi.class))
                .logLevel(logLevel)
                .target(HistoricProcessInstanceApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public IncidentApi incidentServiceClient(CamundaFeignConfig camundaFeignConfig,
                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                             @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                             @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(IncidentApi.class))
                .logLevel(logLevel)
                .target(IncidentApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public MetricsApi metricsServiceClient(CamundaFeignConfig camundaFeignConfig,
                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                           @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                           @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(MetricsApi.class))
                .logLevel(logLevel)
                .target(MetricsApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public MigrationApi migrationServiceClient(CamundaFeignConfig camundaFeignConfig,
                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                               @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                               @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(MigrationApi.class))
                .logLevel(logLevel)
                .target(MigrationApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public ProcessDefinitionApi processDefinitionServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                               @Qualifier("camunda-client-feignClient") Client feignClient,
                                                               @Qualifier("camunda-client-feignOption") Request.Options options,
                                                               @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                               @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                               @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                               @Qualifier("camunda-client-retryer") Retryer retryer,
                                                               @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                               @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(ProcessDefinitionApi.class))
                .logLevel(logLevel)
                .target(ProcessDefinitionApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public ProcessInstanceApi processInstanceServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                           @Qualifier("camunda-client-feignClient") Client feignClient,
                                                           @Qualifier("camunda-client-feignOption") Request.Options options,
                                                           @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                           @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                           @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                           @Qualifier("camunda-client-retryer") Retryer retryer,
                                                           @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                           @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(ProcessInstanceApi.class))
                .logLevel(logLevel)
                .target(ProcessInstanceApi.class, camundaFeignConfig.getBaseServiceUrl());
    }

    @Bean
    public VariableInstanceApi variableInstanceServiceClient(CamundaFeignConfig camundaFeignConfig,
                                                             @Qualifier("camunda-client-feignClient") Client feignClient,
                                                             @Qualifier("camunda-client-feignOption") Request.Options options,
                                                             @Qualifier("camunda-client-feignContract") Contract feignContract,
                                                             @Qualifier("camunda-client-springDecoder") Decoder springDecoder,
                                                             @Qualifier("camunda-client-feignFormEncoder") Encoder feignFormEncoder,
                                                             @Qualifier("camunda-client-retryer") Retryer retryer,
                                                             @Qualifier("camunda-client-feignLoggerLevel") Logger.Level logLevel,
                                                             @Qualifier("camunda-client-feignErrorDecoder") CustomErrorDecoder errorDecoder) {
        if (camundaFeignConfig.getBaseServiceUrl() == null) {
            log.error("baseServiceUrl of web service must be set and not be null or empty.");
            throw new CamundaClientConfigurationException
                    ("baseServiceUrl of web service must be set and not be null or empty.");
        }
        return Feign.builder().client(feignClient)
                .options(options)
                .encoder(feignFormEncoder)
                .decoder(springDecoder)
                .errorDecoder(errorDecoder)
                .contract(feignContract)
                .retryer(retryer)
                .logger(new Slf4jLogger(VariableInstanceApi.class))
                .logLevel(logLevel)
                .target(VariableInstanceApi.class, camundaFeignConfig.getBaseServiceUrl());
    }
}
