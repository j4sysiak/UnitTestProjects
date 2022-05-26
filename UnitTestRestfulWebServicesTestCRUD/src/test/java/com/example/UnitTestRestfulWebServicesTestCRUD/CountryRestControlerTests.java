package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.controller.CountryRestController;
import com.example.UnitTestRestfulWebServicesTestCRUD.model.Country;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CountryRestController.class)
public class CountryRestControlerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private CountryRepository countryRepository;

    @Test
    public void testListOfCountries() throws Exception  {
        List<Country> countries = new ArrayList();

        countries.add(Country.builder().id(1L).name("Poland").build());
        countries.add(Country.builder().id(2L).name("USA").build());
        countries.add(Country.builder().id(3L).name("Germany").build());
        countries.add(Country.builder().id(4L).name("India").build());

        Mockito.when(countryRepository.findAllByOrderByNameAsc()).thenReturn(countries);

        String url = "/countries/list";
        mockMvc.perform(get(url)).andExpect(status().isOk());
    }
}
