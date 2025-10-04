package com.spring.resttemplate.config;

import com.spring.resttemplate.exception.RestTemplateExceptionHandler;
import com.spring.resttemplate.interceptor.LoggingInterceptor;
import com.spring.resttemplate.properties.ApplicationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.time.Duration;
import java.util.List;

@Configuration
public class RestTemplateConfig {

    //    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplate(ApplicationProperties properties,
                                     LoggingInterceptor interceptor,
                                     RestTemplateExceptionHandler restTemplateExceptionHandler) {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(Duration.ofSeconds(5));
        factory.setReadTimeout(Duration.ofSeconds(5));

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(factory);
        restTemplate.setInterceptors(List.of(interceptor));
        restTemplate.setErrorHandler(restTemplateExceptionHandler);

        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(properties.getUserServiceBaseUrl()));
        return restTemplate;
    }
}
