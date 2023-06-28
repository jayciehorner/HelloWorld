package com.skillstorm.training.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Car;
@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Long>{

	
	// Tell JPA to generate some more queries than the ones we are getting from CrudRepository
	Iterable<Car>findByMake(String make);
	
	Iterable<Car>findByModel(String model);
	
	Iterable<Car>findByYear(int year);
	
	Car findByVin(String vin);
	
	
}
