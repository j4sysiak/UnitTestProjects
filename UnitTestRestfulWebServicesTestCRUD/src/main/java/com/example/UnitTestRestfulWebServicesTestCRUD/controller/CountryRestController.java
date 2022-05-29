package com.example.UnitTestRestfulWebServicesTestCRUD.controller;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;
import com.example.UnitTestRestfulWebServicesTestCRUD.repository.CountryRepository;
import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.CountryService;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getCountryById(@PathVariable Integer id) {
        System.out.println("CountryById REST API is invoked ... ");
        return new ResponseEntity<>(countryService.getUserById(id), HttpStatus.OK);
    }

//    @GetMapping("/user/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
//        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
//    }

//    @PostMapping("/countries/save")
//    public String save(@RequestBody Country country) {
//        System.out.println("ID: " + country.getId() + " Name: " + country.getName());
//        Country savedCountry = countryRepository.save(country);
//        return String.valueOf(savedCountry.getId());
//    }
//
//    @GetMapping("/countries/delete/{id}")
//    public void delete(@PathVariable("id") Integer id) {
//        System.out.println("Country ID: " + id);
//        countryRepository.deleteById(id);
//    }

}
