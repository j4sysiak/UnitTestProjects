package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository {
    List<Country> findAllByOrderByNameAsc();
}
