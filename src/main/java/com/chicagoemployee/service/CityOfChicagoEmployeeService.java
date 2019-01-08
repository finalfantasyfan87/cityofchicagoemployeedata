package com.chicagoemployee.service;

import com.chicagoemployee.model.CityOfChicagoEmployee;

import java.util.List;
import java.util.Optional;

public interface CityOfChicagoEmployeeService {
     void save(CityOfChicagoEmployee employee);
     void delete(CityOfChicagoEmployee employee);
    List<CityOfChicagoEmployee> findAll();
     Optional<CityOfChicagoEmployee> findById(String id);
     Optional<CityOfChicagoEmployee> findEmployeeByName(String name);
     List<CityOfChicagoEmployee> findEmployeeByPartialName(String partialName);
     List<CityOfChicagoEmployee> findAllByAnnualSalaryGreaterThan(Double salary);
    List<CityOfChicagoEmployee> findAllByAnnualSalaryLessThan(Double salary);

}
