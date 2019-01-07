package com.chicagoemployee.controller;

import com.chicagoemployee.model.EmployeeResponseDTO;
import com.chicagoemployee.repositories.CityOfChicagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    CityOfChicagoRepository cityOfChicagoRepository;

    //get my employee data from an external api
    private EmployeeResponseDTO[] generateEmployeeResponse() {
        RestTemplate restTemplate = new RestTemplate();
        // ObjectMapper mapper
        EmployeeResponseDTO[] employeeResponse = restTemplate.getForObject(CHICAGO_EMPLOYEES_URL, EmployeeResponseDTO[].class);
        return employeeResponse;
    }

    //view all the City Of Chicago Employees
    @GetMapping("/employees")
    public EmployeeResponseDTO[] getEmployees() {
        EmployeeResponseDTO[] chicagoEmployees = generateEmployeeResponse();
         for (EmployeeResponseDTO chicagoEmployee : chicagoEmployees) {
cityOfChicagoRepository.save(chicagoEmployee);
        }

        myLogger.info(String.valueOf(chicagoEmployees[2].getAnnualSalary()));
        return chicagoEmployees;
    }

    //view a specific City of Chicago Employee
    @GetMapping("/employee/{id}")
    public Optional<EmployeeResponseDTO> getEmployee(@PathVariable("id") String id) {

        return cityOfChicagoRepository.findById(id);
    }


}
