package com.spring.resttemplate.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class LoggingInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {

        log.info("Interceptor : URI : {}, Method : {}, Body: {}", request.getURI().getPath(), request.getMethod().name(), new String(body));

        ClientHttpResponse response = execution.execute(request, body);

        log.info("Response Status Code : {}", response.getStatusCode());

        return response;
    }
}
