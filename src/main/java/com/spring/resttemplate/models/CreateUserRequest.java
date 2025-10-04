package com.spring.resttemplate.models;

import lombok.Data;

@Data
public class CreateUserRequest {

    private String name;
    private String email;
}
