package com.spring.resttemplate.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.net.URI;

@Slf4j
@Component
public class RestTemplateExceptionHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().isError();
    }

    @Override // 401, 403, 404, 400
    public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {
        if (response.getStatusCode().is4xxClientError()) {
            log.error("Client error occurred  For URL : {}, Method : {}, With ErrorCode: {}", url.getPath(), method.name(), response.getStatusCode());
        } else if (response.getStatusCode().is5xxServerError()) {
            log.error("Server error occurred  For URL : {}, Method : {}, With ErrorCode: {}", url.getPath(), method.name(), response.getStatusCode());
        }
    }
}
