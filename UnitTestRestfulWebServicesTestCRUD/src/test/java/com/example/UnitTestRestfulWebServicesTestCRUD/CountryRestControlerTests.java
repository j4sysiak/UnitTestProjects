package com.example.UnitTestRestfulWebServicesTestCRUD;

import com.example.UnitTestRestfulWebServicesTestCRUD.controller.CountryRestController;
import com.example.UnitTestRestfulWebServicesTestCRUD.controller.UserRestController;
import com.example.UnitTestRestfulWebServicesTestCRUD.entity.Country;
import com.example.UnitTestRestfulWebServicesTestCRUD.entity.User;
import com.example.UnitTestRestfulWebServicesTestCRUD.repository.CountryRepository;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.CountryService;
import com.example.UnitTestRestfulWebServicesTestCRUD.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CountryRestController.class)
public class CountryRestControlerTests {

    @Autowired
    private CountryRestController countryRestController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CountryService countryService;

    @Test
    public void getCountryByIdTest() throws Exception {

        //mock the data returned by the CountryService class
        when(countryService.geCountryById(anyInt())).thenReturn(Country.builder()
                .name("USA")
                .build());

        //create a mock HTTP request to verify the expected result
        mockMvc.perform(MockMvcRequestBuilders.get("/country/12"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("USA"))
                .andExpect(status().isOk());

    }

//    @Test
//    public void testCreateNewCountry() throws Exception {
//
//        Country newCountry = Country.builder()
//                //.id(100)
//                .name("Canada")
//                .build();
//
//        Country savedCountry = Country.builder()
//                .id(1)
//                .name("Canada")
//                .build();
//
//        Mockito.when(countryRepository.save(newCountry)).thenReturn(savedCountry);
//
//        this.mockMvc.perform(post("/countries/save")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("test")
//        ).andExpect(status().isOk());
//    }
/*
    @Test
    public void testListOfCountries() throws Exception {
        List<Country> listOfCountries = new ArrayList();
        listOfCountries.add(Country.builder().id(1).name("Poland").build());
        listOfCountries.add(Country.builder().id(2).name("USA").build());
        listOfCountries.add(Country.builder().id(3).name("Germany").build());
        listOfCountries.add(Country.builder().id(4).name("India").build());

        Mockito.when(countryRepository.findAllByOrderByNameAsc()).thenReturn(listOfCountries);

        String url = "/countries/list";
        MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andReturn();

        String actualJsonResponse = mvcResult.getResponse().getContentAsString();
        System.out.println(actualJsonResponse);

        // w logach mamy:
        //listOfCountries REST API is invoked ...

//    [
//        {"id":1,"name":"Poland","states":null},
//        {"id":2,"name":"USA","states":null},
//        {"id":3,"name":"Germany","states":null},
//        {"id":4,"name":"India","states":null}
//    ]


        String expectedJsonResponse = objectMapper.writeValueAsString(listOfCountries);
        assertThat(actualJsonResponse).isEqualToIgnoringCase(expectedJsonResponse);
    }
 */
}
