package com.spring.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestTemplateApplication {

    // Custom RestTemplate with Configuration like - {Timeout, etc}
    // Interceptor for Logging
    // Custom Error Handler

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestTemplateApplication.class, args);
    }

}
