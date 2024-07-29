package com.riwi.final_assessment.api.controllers;

import com.riwi.final_assessment.api.dto.request.UserBasicRequest;
import com.riwi.final_assessment.api.dto.request.UserCompleteRequest;
import com.riwi.final_assessment.api.dto.response.UserBasicResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    @Autowired
    private final IUserService iUserService;

    @GetMapping("/{id}")
    public ResponseEntity<UserBasicResponse> getUserById(@PathVariable Long id) {
        UserBasicResponse userResponse = iUserService.findById(id);
        return ResponseEntity.ok(userResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        iUserService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserBasicResponse> updateUser(@RequestBody UserBasicRequest userBasicRequest, @PathVariable Long id) {
        UserBasicResponse updatedUserResponse = iUserService.update(userBasicRequest, id);
        return ResponseEntity.ok(updatedUserResponse);
    }

    @PostMapping
    public ResponseEntity<UserBasicResponse> createUser(@RequestBody UserCompleteRequest userCompleteRequest) {
        UserBasicResponse createdUserResponse = iUserService.create(userCompleteRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserResponse);
    }
}
