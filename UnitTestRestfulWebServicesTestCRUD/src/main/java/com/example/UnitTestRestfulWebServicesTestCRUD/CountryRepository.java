package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

   //void deleteById(Integer id);

    @Override
    Country save(Country entity);

    List<Country> findAllByOrderByNameAsc();
}