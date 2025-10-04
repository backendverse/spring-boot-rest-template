package com.spring.resttemplate.controller;

import com.spring.resttemplate.models.CreateUserRequest;
import com.spring.resttemplate.models.User;
import com.spring.resttemplate.service.interfaces.AuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/audits")
@RequiredArgsConstructor
public class AuditController {

    private final AuditService auditService;

    //Task: If User Exists Already In The User Service System, Then Update It With latest Data

    @PostMapping
    public ResponseEntity<String> createAudit(@RequestBody CreateUserRequest userRequest) {
        return ResponseEntity.ok().body(auditService.createAudit(userRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return ResponseEntity.ok().body(auditService.getAuditById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAudit(@PathVariable String id) {
        auditService.deleteAudit(id);
        return ResponseEntity.ok().body("User Deleted Successfully");
    }
}
