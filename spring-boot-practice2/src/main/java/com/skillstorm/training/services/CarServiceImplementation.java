package com.skillstorm.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Car;
import com.skillstorm.training.repositories.CarRepository;

@Service
public class CarServiceImplementation implements CarService {
	
	private final CarRepository repo;

//	@Autowired
	public CarServiceImplementation(CarRepository repo) {
		this.repo = repo;
	}

	@Override
	public Car findById(long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Car> findAll() {
		return repo.findAll();
	}

	@Override
	public Car findByVin(String vin) {
		return repo.findByVin(vin);
	}

	@Override
	public Iterable<Car> findByMake(String make) {
		return repo.findByMake(make);
	}

	@Override
	public Iterable<Car> findByModel(String model) {
		return repo.findByModel(model);
	}

	@Override
	public Iterable<Car> findByYear(int year) {
		return repo.findByYear(year);
	}

	@Override
	public Car save(Car car) {
		return repo.save(car);
	}

	@Override
	public void delete(Car car) {
		repo.delete(car);
	}

}
