package com.skillstorm.training.services;

import com.skillstorm.training.models.Computer;

public interface ComputerService {
	
	Computer findById(int id);
	
	Iterable<Computer> findAll();

}