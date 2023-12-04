package com.tosan.camunda.camundaclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tosan.camunda.camundaclient.config.*;
import com.tosan.camunda.camundaclient.external.aspect.*;
import com.tosan.camunda.camundaclient.feign.aspect.FeignUndeclaredThrowableExceptionAspect;
import com.tosan.camunda.camundaclient.util.ExternalTaskResultUtil;
import com.tosan.client.http.core.HttpClientProperties;
import com.tosan.client.http.core.factory.ConfigurableApacheHttpClientFactory;
import com.tosan.client.http.starter.configuration.AbstractFeignConfiguration;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoder;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoderConfig;
import com.tosan.client.http.starter.impl.feign.ExceptionExtractType;
import com.tosan.tools.mask.starter.config.SecureParametersConfig;
import com.tosan.tools.mask.starter.replace.JacksonReplaceHelper;
import com.tosan.tools.mask.starter.replace.JsonReplaceHelperDecider;
import com.tosan.tools.mask.starter.replace.RegexReplaceHelper;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.AnnotatedParameterProcessor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignFormatterRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
@EnableFeignClients
@Slf4j
public class CamundaEngineClientConfig extends AbstractFeignConfiguration {

    public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static HashMap<String, Class<? extends Exception>> exceptionMap = new HashMap<>();

    static {
        exceptionMap.put("Validation.invalid", Exception.class);
    }

    @Override
    @Bean({"camunda-client-objectMapper"})
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        objectMapper
                .setDateFormat(dateFormat)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return objectMapper;
    }

    @Bean("camunda-client-replace-helper")
    public JsonReplaceHelperDecider replaceHelperDecider(JacksonReplaceHelper jacksonReplaceHelper,
                                                         RegexReplaceHelper regexReplaceHelper,
                                                         @Qualifier("camunda-client-secured-parameters")
                                                         SecureParametersConfig secureParametersConfig) {
        return super.replaceHelperDecider(jacksonReplaceHelper, regexReplaceHelper, secureParametersConfig);
    }

    @Bean("camunda-client-httpFeignClientLogger")
    public Logger httpFeignClientLogger(@Qualifier("camunda-client-replace-helper")
                                        JsonReplaceHelperDecider replaceHelperDecider) {
        return super.httpFeignClientLogger(replaceHelperDecider, "camunda-client");
    }

    @Bean("camunda-client-secured-parameters")
    @ConditionalOnMissingBean(name = "camunda-client-secured-parameters")
    public SecureParametersConfig secureParametersConfig() {
        return super.secureParametersConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "camunda.bpm.client")
    @Primary
    public CamundaClientConfig camundaClientConfig() {
        return new CamundaClientConfig();
    }

    @Bean
    @ConditionalOnProperty(name = "camunda.bpm.client.execution.execution-type", havingValue = "parallel", matchIfMissing = false)
    public ParallelBackoffStrategy backoffStrategy(ParallelTaskExecutor parallelTaskExecutor) {
        return new ParallelBackoffStrategy(parallelTaskExecutor);
    }

    @Bean
    @ConditionalOnProperty(name = "camunda.bpm.client.execution.execution-type", havingValue = "parallel", matchIfMissing = false)
    public ParallelTaskExecutor parallelTaskExecutor(@Qualifier("camunda-executorService") ExecutorService executorService) {
        return new ParallelTaskExecutor(executorService);
    }

    @Bean(name = "camunda-executorService")
    @ConditionalOnProperty(name = "camunda.bpm.client.execution.execution-type", havingValue = "parallel", matchIfMissing = false)
    public ExecutorService executorService(CamundaClientConfig camundaClientConfig) {
        if (camundaClientConfig.getExecution() != null && camundaClientConfig.getExecution().getThreadPoolSize() > 0) {
            return Executors.newFixedThreadPool(camundaClientConfig.getExecution().getThreadPoolSize());
        } else {
            throw new RuntimeException("camunda.bpm.client.execution.thread-pool-size is not set or is not valid.");
        }
    }

    @Bean("camunda-client-clientConfig")
    @ConditionalOnMissingBean(name = "camunda-client-clientConfig")
    public HttpClientProperties camundaFeignConfig(CamundaClientConfig camundaClientConfig) {
        CamundaFeignConfig camundaEngineClientConfig = new CamundaFeignConfig();
        camundaEngineClientConfig.setBaseServiceUrl(camundaClientConfig.getBaseUrl());
        HttpClientProperties.ConnectionConfiguration connectionConfiguration =
                new HttpClientProperties.ConnectionConfiguration();
        CamundaRestServiceConfig restServiceConfig = camundaClientConfig.getRestServiceConfig();
        connectionConfiguration.setConnectionTimeout(restServiceConfig.getConnectionTimeout());
        connectionConfiguration.setSocketTimeout(restServiceConfig.getRequestTimeout());
        camundaEngineClientConfig.setConnection(connectionConfiguration);
        return camundaEngineClientConfig;
    }

    @Override
    @Bean("camunda-client-apacheHttpClientFactory")
    public ConfigurableApacheHttpClientFactory apacheHttpClientFactory(
            @Qualifier("camunda-client-httpClientBuilder") HttpClientBuilder builder,
            @Qualifier("camunda-client-connectionManagerFactory") PoolingHttpClientConnectionManagerBuilder connectionManagerBuilder,
            @Qualifier("camunda-client-clientConfig") HttpClientProperties customServerClientConfig) {
        return super.apacheHttpClientFactory(builder, connectionManagerBuilder, customServerClientConfig);
    }

    @Override
    @Bean("camunda-client-clientHttpRequestFactory")
    public ClientHttpRequestFactory clientHttpRequestFactory(
            @Qualifier("camunda-client-apacheHttpClientFactory") ConfigurableApacheHttpClientFactory apacheHttpClientFactory) {
        return super.clientHttpRequestFactory(apacheHttpClientFactory);
    }

    @Override
    @Bean("camunda-client-httpclient")
    public CloseableHttpClient httpClient(
            @Qualifier("camunda-client-apacheHttpClientFactory") ConfigurableApacheHttpClientFactory apacheHttpClientFactory) {
        return super.httpClient(apacheHttpClientFactory);
    }

    @Override
    @Bean("camunda-client-connectionManagerFactory")
    public PoolingHttpClientConnectionManagerBuilder connectionManagerBuilder() {
        return super.connectionManagerBuilder();
    }

    @Override
    @Bean("camunda-client-feignClient")
    public Client feignClient(@Qualifier("camunda-client-httpclient") org.apache.hc.client5.http.classic.HttpClient httpClient) {
        return super.feignClient(httpClient);
    }

    @Override
    @Bean("camunda-client-requestInterceptor")
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
        };
    }

    @Override
    @Bean("camunda-client-requestInterceptors")
    public List<RequestInterceptor> requestInterceptors(
            @Qualifier("camunda-client-clientConfig") HttpClientProperties customServerClientConfig,
            @Qualifier("camunda-client-requestInterceptor") RequestInterceptor requestInterceptor) {
        return super.requestInterceptors(customServerClientConfig, requestInterceptor);
    }

    @Override
    @Bean("camunda-client-feignContract")
    public Contract feignContractWithCustomSpringConversion(
            @Qualifier("camunda-client-feignConversionService") ConversionService feignConversionService,
            List<AnnotatedParameterProcessor> processors) {
        return new SpringMvcContractImpl(feignConversionService, processors);
    }

    @Override
    @Bean("camunda-client-feignConversionService")
    public FormattingConversionService feignConversionService(List<FeignFormatterRegistrar> feignFormatterRegistrars) {
        return super.feignConversionService(feignFormatterRegistrars);
    }

    @Override
    @Bean("camunda-client-feignEncoder")
    public Encoder feignEncoder(@Qualifier("camunda-client-jacksonHttpMessageConverter") HttpMessageConverter<Object> httpMessageConverter) {
        return new SpringEncoderImpl(messageConverters);
    }

    @Override
    @Bean("camunda-client-feignDecoder")
    public Decoder feignDecoder(@Qualifier("camunda-client-jacksonHttpMessageConverter") HttpMessageConverter<Object> httpMessageConverter) {
        return super.feignDecoder(httpMessageConverter);
    }

    @Override
    @Bean("camunda-client-jacksonHttpMessageConverter")
    public HttpMessageConverter<Object> httpMessageConverter(@Qualifier("camunda-client-objectMapper")
                                                             ObjectMapper objectMapper) {
        return super.httpMessageConverter(objectMapper);
    }

    @Override
    @Bean("camunda-client-feignErrorDecoderConfig")
    public CustomErrorDecoderConfig customErrorDecoderConfig(@Qualifier("camunda-client-objectMapper") ObjectMapper objectMapper) {
        CustomErrorDecoderConfig customErrorDecoderConfig = new CustomErrorDecoderConfig();
        customErrorDecoderConfig.setExceptionMap(exceptionMap);
        customErrorDecoderConfig.setExceptionExtractType(ExceptionExtractType.STATIC_MAP);
        customErrorDecoderConfig.setObjectMapper(objectMapper);
        return customErrorDecoderConfig;
    }

    @Override
    @Bean("camunda-client-feignErrorDecoder")
    public CustomErrorDecoder customErrorDecoder(@Qualifier("camunda-client-feignErrorDecoderConfig") CustomErrorDecoderConfig customErrorDecoderConfig) {
        return super.customErrorDecoder(customErrorDecoderConfig);
    }

    @Override
    @Bean("camunda-client-httpClientBuilder")
    public HttpClientBuilder apacheHttpClientBuilder() {
        return super.apacheHttpClientBuilder();
    }

    @Override
    @Bean("camunda-client-retryer")
    @ConditionalOnMissingBean(
            name = {"camunda-client-retryer"}
    )
    public Retryer retryer() {
        return super.retryer();
    }

    @Override
    @Bean("camunda-client-feignLoggerLevel")
    @ConditionalOnMissingBean(
            name = {"camunda-client-feignLoggerLevel"}
    )
    public Logger.Level feignLoggerLevel() {
        return super.feignLoggerLevel();
    }

    @Override
    @Bean("camunda-client-feignOption")
    public Request.Options options(
            @Qualifier("camunda-client-clientConfig") HttpClientProperties customServerClientConfig) {
        return super.options(customServerClientConfig);
    }

    @Bean
    public FeignUndeclaredThrowableExceptionAspect feignUndeclaredThrowableExceptionAspect() {
        return new FeignUndeclaredThrowableExceptionAspect();
    }

    @Bean
    public ExternalTaskMdcAspect externalTaskMdcAspect() {
        return new ExternalTaskMdcAspect();
    }

    @Bean
    public ExternalTaskLogAspect externalTaskLogAspect() {
        return new ExternalTaskLogAspect();
    }

    @Bean
    public ExternalTaskResultAspect externalTaskResultAspect(ExternalTaskResultUtil externalTaskResultUtil) {
        return new ExternalTaskResultAspect(externalTaskResultUtil);
    }

    @Bean
    @ConditionalOnProperty(name = "camunda.bpm.client.execution.execution-type", havingValue = "parallel", matchIfMissing = false)
    public ExternalTaskParallelExecutionAspect externalTaskParallelExecutionAspect(ParallelTaskExecutor parallelTaskExecutor) {
        return new ExternalTaskParallelExecutionAspect(parallelTaskExecutor);
    }

    @Bean
    public ExternalTaskResultUtil externalTaskResultUtil(CamundaClientConfig camundaClientConfig) {
        return new ExternalTaskResultUtil(camundaClientConfig.getRetry());
    }

    @Bean
    public ExternalTaskInfoAspect externalTaskInfoAspect() {
        return new ExternalTaskInfoAspect();
    }
}