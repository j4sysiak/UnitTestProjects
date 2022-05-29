package com.example.UnitTestRestfulWebServicesTestCRUD.service;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;

public interface CountryService {

    Country geCountryById(Integer id);

    Country saveCountry(Country country);
}
