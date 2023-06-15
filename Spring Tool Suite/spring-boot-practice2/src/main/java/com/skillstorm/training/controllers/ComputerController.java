package com.skillstorm.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Computer;
import com.skillstorm.training.services.ComputerService;

@RestController
@RequestMapping("/computers")
public class ComputerController {
	
	private ComputerService serv;
	
	public ComputerController(ComputerService serv) {
		this.serv = serv;
	}
	
@GetMapping("/{id}")
public ResponseEntity<Computer> findById(@PathVariable int id) {
	Computer computer = serv.findById(id);
	if (computer == null)
		return new ResponseEntity<Computer>(computer, HttpStatus.NO_CONTENT);
	else
	return new ResponseEntity<Computer>(computer, HttpStatus.OK);
}

@GetMapping
public Iterable<Computer> findAll(){
	return serv.findAll();
}
}
