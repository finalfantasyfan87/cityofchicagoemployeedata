package com.chicagoemployee.service;

import com.chicagoemployee.model.CityOfChicagoEmployee;

import java.util.List;
import java.util.Optional;

public interface CityOfChicagoEmployeeService {
    public void save(CityOfChicagoEmployee employee);
    public void delete(CityOfChicagoEmployee employee);
    List<CityOfChicagoEmployee> findAll();
    public Optional<CityOfChicagoEmployee> findById(String id);
}
