package com.skillstorm.training.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Car;
import com.skillstorm.training.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	private final CarService serv;

//	@Autowired
	public CarController(CarService serv) {
		this.serv = serv;
	}

	@GetMapping
	public Iterable<Car> findAll() {
		List<Car> cars = new ArrayList<>();
		return serv.findAll();
	}

	@GetMapping("/{id}") // this is going  to be the car_id column from the schema, here the names just need to match
	public Car findById(@PathVariable long id) {
//		Car car = new Car();
//		car.setId(id);
//		System.out.println("id = " + id);
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Car save(@RequestBody Car car) {
		return serv.save(car);
	}

	@PutMapping("/{id}")
	public Car update(@RequestBody Car car, @PathVariable long id) {
		return serv.save(car);
	}

	@DeleteMapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Car car) {
		serv.delete(car);
	}
}
