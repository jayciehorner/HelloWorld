package com.skillstorm.training.services;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Computer;
import com.skillstorm.training.repositories.ComputerRepository;

@Service
public class ComputerServiceImplementation implements ComputerService {
	
	// Inject a Repository instance
	private ComputerRepository repo;
	
//	@Autowired // Spring 4.3 this is optional and can be omitted if only one constructor in the class
	public ComputerServiceImplementation(ComputerRepository repo) {
		this.repo = repo;
	}

	@Override
	public Computer findById(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Computer> findAll() {
		return repo.findAll();
	}

}