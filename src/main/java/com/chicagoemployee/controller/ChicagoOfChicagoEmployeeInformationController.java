package com.chicagoemployee.controller;

import com.chicagoemployee.model.CityOfChicagoEmployee;
import com.chicagoemployee.repositories.CityOfChicagoRepository;
import com.chicagoemployee.service.CityOfChicagoEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by jenny on 12/8/17.
 * This is a very generic app that allows users to search for Chicago employees based on the id and potentially the name
 * I could have used Spring Data. I could save the response data to a Mongo Collection<--more than likely I will do this
 */
@RestController()
public class ChicagoOfChicagoEmployeeInformationController {
    Logger myLogger = Logger.getLogger(ChicagoOfChicagoEmployeeInformationController.class.getName());
    private static final String CHICAGO_EMPLOYEES_URL = "https://data.cityofchicago.org/resource/tt4n-kn4t.json";

   @Autowired
   CityOfChicagoEmployeeService cityOfChicagoEmployeeService;

    //get my employee data from an external api
    private CityOfChicagoEmployee[] generateEmployeeResponse() {
        RestTemplate restTemplate = new RestTemplate();
        CityOfChicagoEmployee[] employeeResponse = restTemplate.getForObject(CHICAGO_EMPLOYEES_URL, CityOfChicagoEmployee[].class);
        return employeeResponse;
    }

    //view all the City Of Chicago Employees
    @PostMapping("/saveEmployees")
    public String saveEmployees() {
        CityOfChicagoEmployee[] chicagoEmployees = generateEmployeeResponse();
         for (CityOfChicagoEmployee chicagoEmployee : chicagoEmployees) {
             cityOfChicagoEmployeeService.save(chicagoEmployee);
        }
         return "Employees were saved to database";
    }


    @GetMapping("/employees")
    public List<CityOfChicagoEmployee> getEmployees(){
        return cityOfChicagoEmployeeService.findAll();
    }


    //view a specific City of Chicago Employee
    @GetMapping("/employee/{id}")
    public Optional<CityOfChicagoEmployee> getEmployee(@PathVariable("id") String id) {
        return cityOfChicagoEmployeeService.findById(id);
    }


}
