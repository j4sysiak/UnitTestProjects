package com.example.UnitTestRestfulWebServicesTestCRUD.repository;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {

   //void deleteById(Integer id);

    @Override
    Country save(Country entity);

    List<Country> findAllByOrderByNameAsc();
}