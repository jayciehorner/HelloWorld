package com.skillstorm.training.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Car;
import com.skillstorm.training.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	private final Logger logger = LoggerFactory.getLogger(CarController.class);

	private final CarService service;

	@Autowired
	public CarController(CarService service) {
		this.service = service;
	}

	@GetMapping // localhost:8080/cars?year=2017 or
				// localhost:8080/cars?model=mazda
	public Iterable<Car> findAll(
			@RequestParam(name = "model", required = false) String model,
			@RequestParam(name = "year", required = false) Integer year) {
		logger.debug(
				"Request Parameter Values: model=" + model + " year=" + year);
		logger.trace("This is a trace");
		logger.info("This is an info log");
		logger.warn("This is a warn log");
		logger.error("This is a warn log");
		if (model != null) {
			return service.findByModel(model);
		}
		if (year != null) {
			return service.findByYear(year);
		}
		return service.findAll();
	}

	@GetMapping("/search")
	public Iterable<Car> findBySearchCriteria() {
		return null;
	}

	@GetMapping("/{id}") // this is going to be the car_id column from the
							// schema, here the names just need to match
	public Car findById(@PathVariable long id) {
		return service.findById(id); //
	}

	@GetMapping("/make/{make}") // TODO debug
	public Iterable<Car> findByMake(@PathVariable String make) {
		return service.findByMake(make); //
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Car save(@RequestBody Car car) {
		return service.save(car);
	}

	@PutMapping("/{id}")
	public Car update(@RequestBody Car car, @PathVariable long id) {
		car.setId(id);
		return service.save(car);
	}

	@DeleteMapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Car car) {
		service.delete(car);
	}

}