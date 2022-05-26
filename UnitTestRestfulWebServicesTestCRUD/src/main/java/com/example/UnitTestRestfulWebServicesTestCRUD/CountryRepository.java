package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    List<Country> findAllByOrderByNameAsc();

    void deleteById(Integer id);
}
