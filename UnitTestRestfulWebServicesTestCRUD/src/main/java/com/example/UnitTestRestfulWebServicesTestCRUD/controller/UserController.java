package com.example.UnitTestRestfulWebServicesTestCRUD.controller;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;
import com.example.UnitTestRestfulWebServicesTestCRUD.repository.UserRepository;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }
}
