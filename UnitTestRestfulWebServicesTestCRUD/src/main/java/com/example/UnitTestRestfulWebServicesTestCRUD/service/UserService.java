package com.example.UnitTestRestfulWebServicesTestCRUD.service;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User getUserById(Integer id);

    public User saveUser(User user);
}
