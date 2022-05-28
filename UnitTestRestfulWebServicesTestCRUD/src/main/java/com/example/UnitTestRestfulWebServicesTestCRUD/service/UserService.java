package com.example.UnitTestRestfulWebServicesTestCRUD.service;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;

public interface UserService {

    public User getUserById(Integer id);

    public User saveUser(User user);
}
