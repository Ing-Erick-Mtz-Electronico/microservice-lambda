package com.microservice_user.microservice_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice_user.microservice_user.service.UserSerivice;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserSerivice userSerivice;

    @GetMapping("/")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userSerivice.getUsers());
    }
}
