package com.spring.resttemplate.service.interfaces;

import com.spring.resttemplate.models.CreateUserRequest;
import com.spring.resttemplate.models.User;

public interface AuditService {
    String createAudit(CreateUserRequest userRequest);

    User getAuditById(String id);

    void deleteAudit(String usersId);

}
