package org.fun.controller;

import org.fun.json.CityOfChicagoEmployeeJson;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jenny on 12/8/17.
 */
@RestController()
public class ChicagoOfChicagoEmployeeInformationController {

    private static final String CHICAGO_EMPLOYEES_URL = "https://data.cityofchicago.org/resource/tt4n-kn4t.json";
    //private static final String SALARY_ONLY= "https://data.cityofchicago.org/resource/tt4n-kn4t.json?salary_or_hourly=Salary";
    // https://data.cityofchicago.org/resource/tt4n-kn4t.json?salary_or_hourly=Salary&department=POLICE
    @GetMapping("/employees")
    public ResponseEntity<List<CityOfChicagoEmployeeJson>> getEmployees(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(CHICAGO_EMPLOYEES_URL,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<CityOfChicagoEmployeeJson>>() {
                });
    }

}
