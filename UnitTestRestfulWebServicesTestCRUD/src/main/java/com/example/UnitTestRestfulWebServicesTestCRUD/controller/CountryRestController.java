package com.example.UnitTestRestfulWebServicesTestCRUD.controller;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Integer id) {
        System.out.println("CountryById REST API is invoked ... ");
        return new ResponseEntity<>(countryService.geCountryById(id), HttpStatus.OK);
    }

    @PostMapping("/country/save")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
        System.out.println("SaveCountry REST API is invoked ... ");
        Country savedCountry = countryService.saveCountry(country);
        return new ResponseEntity<>(countryService.saveCountry(country), HttpStatus.CREATED);
    }

    @GetMapping("/country/delete/{id}")
    public void deleteCountry(@PathVariable("id") Integer id) {
        System.out.println("DeleteCountry REST API is invoked ... ");
        countryService.deleteById(id);
    }

//    @PostMapping("/countries/save")
//    public String save(@RequestBody Country country) {
//        System.out.println("ID: " + country.getId() + " Name: " + country.getName());
//        Country savedCountry = countryRepository.save(country);
//        return String.valueOf(savedCountry.getId());
//    }
}
