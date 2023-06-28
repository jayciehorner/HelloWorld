package com.skillstorm.training.services;

import com.skillstorm.training.models.Car;

public interface CarService {

	Car findById(long id);
	Iterable<Car> findAll();
	Car findByVin(String vin);
	Iterable<Car> findByMake(String make);
	Iterable<Car> findByModel(String model);
	Iterable<Car> findByYear(int year);
	
	Car save(Car car);
//	Car update(Car car);
	void delete(Car car);

	
	
}
