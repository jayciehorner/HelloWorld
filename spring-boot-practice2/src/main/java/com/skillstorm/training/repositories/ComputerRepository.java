package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Computer;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Integer>{

}