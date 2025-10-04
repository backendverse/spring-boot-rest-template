package com.spring.resttemplate.service.impl;

import com.spring.resttemplate.models.CreateUserRequest;
import com.spring.resttemplate.models.User;
import com.spring.resttemplate.service.interfaces.AuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class AuditServiceImpl implements AuditService {

    private final RestTemplate restTemplate;

    @Override
    public String createAudit(CreateUserRequest userRequest) {
        if (!ObjectUtils.isEmpty(userRequest.getEmail())) {
            ResponseEntity<User> userByEmail = restTemplate.getForEntity("/users/email/".concat(userRequest.getEmail()), User.class);
            if (userByEmail.getStatusCode().is2xxSuccessful() && userByEmail.hasBody()) {
                System.out.println("performing PATCh Operation");
                User user = userByEmail.getBody();
//                restTemplate.patchForObject("/users/id".concat(user.getId()), userRequest, String.class);
                ResponseEntity<String> response = restTemplate.exchange("/users/".concat(user.getId()), HttpMethod.PATCH, new HttpEntity<>(userRequest), String.class);

                System.out.println("User Updated successfully");
                return "User Updated successfully";
            } else {
                // create User
                HttpHeaders headers = new HttpHeaders();
                headers.add("api-key", "1234");

                HttpEntity<CreateUserRequest> entity = new HttpEntity<>(userRequest, headers);

                ResponseEntity<String> response = restTemplate.exchange("/users", HttpMethod.POST, entity, String.class);
                if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
                    return "User Created Successfully";
                }
            }
        }


        return "empty body";
    }

    @Override
    public User getAuditById(String id) {
        ResponseEntity<User> response = restTemplate.getForEntity("/users/".concat(id), User.class);
        if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
            return response.getBody();
        }
        System.out.println("User not found with given id");
//        return restTemplate.getForObject("/users/".concat(id), User.class);
        return null;
    }

    @Override
    public void deleteAudit(String id) {
        restTemplate.delete("/users/".concat(id));
        System.out.println("User Deleted Successfully");
    }

}
