package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.controller.CountryRestController;
import com.example.UnitTestRestfulWebServicesTestCRUD.model.Country;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apiguardian.api.API;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
        List<Country> listOfCountries = new ArrayList();

        listOfCountries.add(Country.builder().id(1L).name("Poland").build());
        listOfCountries.add(Country.builder().id(2L).name("USA").build());
        listOfCountries.add(Country.builder().id(3L).name("Germany").build());
        listOfCountries.add(Country.builder().id(4L).name("India").build());

        Mockito.when(countryRepository.findAllByOrderByNameAsc()).thenReturn(listOfCountries);

        String url = "/countries/list";
        MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andReturn();

        String actualJsonResponse = mvcResult.getResponse().getContentAsString();
        System.out.println(actualJsonResponse);

// w logach mamy:
//listOfCountries REST API is invoked ...
        /*
    [
        {"id":1,"name":"Poland","states":null},
        {"id":2,"name":"USA","states":null},
        {"id":3,"name":"Germany","states":null},
        {"id":4,"name":"India","states":null}
    ]
        */


        String expectedJsonResponse = objectMapper.writeValueAsString(listOfCountries);

        assertThat(actualJsonResponse).isEqualToIgnoringCase(expectedJsonResponse);
    }
}
