package com.chicagoemployee.repositories;

import com.chicagoemployee.model.CityOfChicagoEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityOfChicagoRepository extends MongoRepository<CityOfChicagoEmployee, String> {

}

