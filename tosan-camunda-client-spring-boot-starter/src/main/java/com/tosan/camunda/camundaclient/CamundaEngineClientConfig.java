package com.tosan.camunda.camundaclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tosan.camunda.camundaclient.config.CamundaClientConfig;
import com.tosan.camunda.camundaclient.config.CamundaFeignConfig;
import com.tosan.camunda.camundaclient.config.CamundaRestServiceConfig;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskInfoAspect;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskLogAspect;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskMdcAspect;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskResultAspect;
import com.tosan.camunda.camundaclient.feign.aspect.FeignUndeclaredThrowableExceptionAspect;
import com.tosan.camunda.camundaclient.util.ExternalTaskResultUtil;
import com.tosan.client.http.core.HttpClientProperties;
import com.tosan.client.http.starter.configuration.AbstractFeignConfiguration;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoder;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoderConfig;
import com.tosan.client.http.starter.impl.feign.ExceptionExtractType;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.commons.httpclient.ApacheHttpClientConnectionManagerFactory;
import org.springframework.cloud.commons.httpclient.ApacheHttpClientFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

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

    @Bean({"camunda-client-objectMapper"})
    public ObjectMapper camundaClientObjectMapper() {
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

    @Bean
    @ConfigurationProperties(prefix = "camunda.bpm.client")
    @Primary
    public CamundaClientConfig camundaClientConfig() {
        return new CamundaClientConfig();
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
    public ApacheHttpClientFactory apacheHttpClientFactory(
            @Qualifier("camunda-client-httpClientBuilder") HttpClientBuilder builder,
            @Qualifier("camunda-client-connectionManagerFactory") ApacheHttpClientConnectionManagerFactory clientConnectionManagerFactory,
            @Qualifier("camunda-client-clientConfig") HttpClientProperties httpClientProperties) {
        return super.apacheHttpClientFactory(builder, clientConnectionManagerFactory, httpClientProperties);
    }

    @Override
    @Bean("camunda-client-clientHttpRequestFactory")
    public ClientHttpRequestFactory clientHttpRequestFactory(
            @Qualifier("camunda-client-apacheHttpClientFactory") ApacheHttpClientFactory apacheHttpClientFactory) {
        return super.clientHttpRequestFactory(apacheHttpClientFactory);
    }

    @Override
    @Bean("camunda-client-httpclient")
    public CloseableHttpClient httpClient(
            @Qualifier("camunda-client-apacheHttpClientFactory") ApacheHttpClientFactory apacheHttpClientFactory) {
        return super.httpClient(apacheHttpClientFactory);
    }

    @Override
    @Bean("camunda-client-connectionManagerFactory")
    public ApacheHttpClientConnectionManagerFactory connectionManagerFactory() {
        return super.connectionManagerFactory();
    }

    @Override
    @Bean("camunda-client-feignClient")
    public Client feignClient(@Qualifier("camunda-client-httpclient") HttpClient httpClient) {
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
    public Contract feignContract() {
        return new SpringMvcContractImpl();
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
    public ExternalTaskResultUtil externalTaskResultUtil(CamundaClientConfig camundaClientConfig) {
        return new ExternalTaskResultUtil(camundaClientConfig.getRetry());
    }

    @Bean
    public ExternalTaskInfoAspect externalTaskInfoAspect() {
        return new ExternalTaskInfoAspect();
    }
}