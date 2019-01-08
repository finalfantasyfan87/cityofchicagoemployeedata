package com.chicagoemployee.serviceImpl;

import com.chicagoemployee.model.CityOfChicagoEmployee;
import com.chicagoemployee.repositories.CityOfChicagoRepository;
import com.chicagoemployee.service.CityOfChicagoEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("cityOfChicagoEmployeeService")
public class CityOfChicagoEmployeeServiceImpl implements CityOfChicagoEmployeeService {

    @Autowired
    CityOfChicagoRepository cityOfChicagoRepository;


    @Override
    public void save(CityOfChicagoEmployee employee) {
        cityOfChicagoRepository.save(employee);
    }

    @Override
    public void delete(CityOfChicagoEmployee employee) {
cityOfChicagoRepository.delete(employee);
    }

    @Override
    public List<CityOfChicagoEmployee> findAll() {
        return cityOfChicagoRepository.findAll();
    }

    @Override
    public Optional<CityOfChicagoEmployee> findById(String id) {
        return cityOfChicagoRepository.findById(id);
    }
}
