package com.tosan.camunda.camundaclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tosan.camunda.camundaclient.config.CamundaClientConfig;
import com.tosan.camunda.camundaclient.config.CamundaFeignConfig;
import com.tosan.camunda.camundaclient.config.CamundaRestServiceConfig;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskLogAspect;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskMdcAspect;
import com.tosan.camunda.camundaclient.external.aspect.ExternalTaskResultAspect;
import com.tosan.camunda.camundaclient.feign.aspect.FeignUndeclaredThrowableExceptionAspect;
import com.tosan.client.http.starter.HttpClientProperties;
import com.tosan.client.http.starter.impl.ConfigurableApacheHttpClientFactory;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoder;
import com.tosan.client.http.starter.impl.feign.CustomErrorDecoderConfig;
import com.tosan.client.http.starter.impl.feign.ExceptionExtractType;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.httpclient.ApacheHttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.commons.httpclient.ApacheHttpClientConnectionManagerFactory;
import org.springframework.cloud.commons.httpclient.ApacheHttpClientFactory;
import org.springframework.cloud.commons.httpclient.DefaultApacheHttpClientConnectionManagerFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
@Configuration
@EnableFeignClients
@Slf4j
public class CamundaEngineClientConfig {
    public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    private static HashMap<String, Class<? extends Exception>> exceptionMap = new HashMap<>();
    private ObjectFactory<HttpMessageConverters> messageConverters;

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

    @Bean({"camunda-client-jacksonHttpMessageConverter"})
    public HttpMessageConverter<Object> httpMessageConverter(@Qualifier("camunda-client-objectMapper")
                                                                     ObjectMapper camundaClientObjectMapper) {
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter(camundaClientObjectMapper);
        messageConverters = () -> new HttpMessageConverters(mappingJackson2HttpMessageConverter);
        return mappingJackson2HttpMessageConverter;
    }

    @Bean
    @ConfigurationProperties(prefix = "camunda.bpm.client")
    @Primary
    public CamundaClientConfig camundaClientConfig() {
        return new CamundaClientConfig();
    }

    @Bean
    @ConditionalOnMissingBean
    public CamundaFeignConfig camundaFeignConfig(CamundaClientConfig camundaClientConfig) {
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

    @Bean("camunda-client-connectionManagerFactory")
    public ApacheHttpClientConnectionManagerFactory connectionManagerFactory() {
        return new DefaultApacheHttpClientConnectionManagerFactory();
    }

    @Bean("camunda-client-apacheHttpClientFactory")
    public ApacheHttpClientFactory apacheHttpClientFactory(
            @Qualifier("camunda-client-apacheHttpClientBuilder")
                    HttpClientBuilder builder,
            @Qualifier("camunda-client-connectionManagerFactory")
                    ApacheHttpClientConnectionManagerFactory connectionManagerFactory,
            CamundaFeignConfig camundaFeignConfig) {
        return new ConfigurableApacheHttpClientFactory(builder, connectionManagerFactory, camundaFeignConfig);
    }

    @Bean("camunda-client-clientHttpRequestFactory")
    public ClientHttpRequestFactory clientHttpRequestFactory(
            @Qualifier("camunda-client-apacheHttpClientFactory") ApacheHttpClientFactory apacheHttpClientFactory) {
        return new HttpComponentsClientHttpRequestFactory(apacheHttpClientFactory.createBuilder().build());
    }

    @Bean("camunda-client-httpclient")
    public CloseableHttpClient httpClient(
            @Qualifier("camunda-client-apacheHttpClientFactory") ApacheHttpClientFactory apacheHttpClientFactory) {
        return apacheHttpClientFactory.createBuilder().build();
    }

    @Bean("camunda-client-feignOption")
    Request.Options options(CamundaFeignConfig camundaFeignConfig) {
        HttpClientProperties.ConnectionConfiguration connectionConfiguration = camundaFeignConfig
                .getConnection();
        return new Request.Options(
                connectionConfiguration.getConnectionTimeout(), TimeUnit.MILLISECONDS,
                connectionConfiguration.getSocketTimeout(), TimeUnit.MILLISECONDS, connectionConfiguration
                .isFollowRedirects());
    }

    @Bean("camunda-client-feignClient")
    public Client feignClient(@Qualifier("camunda-client-httpclient") HttpClient httpClient) {
        return new ApacheHttpClient(httpClient);
    }

    @Bean("camunda-client-feignContract")
    public Contract feignContract() {
        return new SpringMvcContractImpl();
    }

    @Bean("camunda-client-feignFormEncoder")
    @DependsOn(value = "camunda-client-jacksonHttpMessageConverter")
    public Encoder feignFormEncoder() {
        return new SpringEncoderImpl(messageConverters);
    }

    @Bean("camunda-client-springDecoder")
    @DependsOn(value = "camunda-client-jacksonHttpMessageConverter")
    public Decoder springDecoder() {
        return new ResponseEntityDecoder(new SpringDecoder(messageConverters));
    }

    @Bean("camunda-client-feignErrorDecoderConfig")
    public CustomErrorDecoderConfig customErrorDecoderConfig(@Qualifier("camunda-client-objectMapper") ObjectMapper objectMapper) {
        CustomErrorDecoderConfig customErrorDecoderConfig = new CustomErrorDecoderConfig();
        customErrorDecoderConfig.setExceptionMap(exceptionMap);
        customErrorDecoderConfig.setExceptionExtractType(ExceptionExtractType.STATIC_MAP);
        customErrorDecoderConfig.setObjectMapper(objectMapper);
        return customErrorDecoderConfig;
    }

    @Bean("camunda-client-feignErrorDecoder")
    public CustomErrorDecoder customErrorDecoder(@Qualifier("camunda-client-feignErrorDecoderConfig") CustomErrorDecoderConfig
                                                         customErrorDecoderConfig) {
        return new CustomErrorDecoder(customErrorDecoderConfig);
    }

    @Bean("camunda-client-apacheHttpClientBuilder")
    public HttpClientBuilder apacheHttpClientBuilder() {
        return HttpClientBuilder.create();
    }

    @Bean("camunda-client-retryer")
    @ConditionalOnMissingBean(
            name = {"camunda-client-feignLoggerLevel"}
    )
    public Retryer retryer() {
        return Retryer.NEVER_RETRY;
    }


    @Bean("camunda-client-feignLoggerLevel")
    @ConditionalOnMissingBean(
            name = {"camunda-client-feignLoggerLevel"}
    )
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
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
    public ExternalTaskResultAspect externalTaskResultAspect(CamundaClientConfig camundaClientConfig) {
        return new ExternalTaskResultAspect(camundaClientConfig);
    }
}