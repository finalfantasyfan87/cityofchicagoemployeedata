package com.chicagoemployee.repositories;

import com.chicagoemployee.model.CityOfChicagoEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CityOfChicagoRepository extends  MongoRepository<CityOfChicagoEmployee, String> {

    Optional<CityOfChicagoEmployee> findByNameEquals(String s);
    List<CityOfChicagoEmployee> findByNameContains(String s);
    List<CityOfChicagoEmployee> findByAnnualSalaryGreaterThanEqual(String s);

    List<CityOfChicagoEmployee> findByAnnualSalaryIsLessThanEqual(String s);
}

