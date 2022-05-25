package com.example.UnitTestRestfulWebServicesTestCRUD.controller;

import com.example.UnitTestRestfulWebServicesTestCRUD.CountryRepository;
import com.example.UnitTestRestfulWebServicesTestCRUD.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryRestController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/countries/list")
    public List<Country> listOfCountries() {
        System.out.println("listOfCountries REST API is invoked ... ");
        return countryRepository.findAllByOrderByNameAsc();
    }

    @PostMapping("/countries/save")
    public String save(@RequestBody Country country) {
        System.out.println("ID: " + country.getId() + " Name: " + country.getName());
        Country savedCountry = (Country) countryRepository.save(country);
        return String.valueOf(savedCountry.getId());
    }

    @GetMapping("/countries/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        System.out.println("Country ID: " + id);
        countryRepository.deleteById(id);
    }

}
