package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.CarMake;
@Repository
public interface CarModelRepository extends CrudRepository<CarMake, Long>{

}
