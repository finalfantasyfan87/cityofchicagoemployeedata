package com.chicagoemployee.repositories;

import com.chicagoemployee.model.CityOfChicagoEmployee;
import com.chicagoemployee.model.EmployeeResponseDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityOfChicagoRepository extends MongoRepository<EmployeeResponseDTO, String> {

}

