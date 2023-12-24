package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.Repository.RegistrationRepository;
import com.webapp.entity.Registration;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/Registration")
public class RestController {
    @Autowired
	private RegistrationRepository repo;
    
	@GetMapping
	public List<Registration> AllRegistration() {
		List<Registration> findAll = repo.findAll();
		return findAll;
	}
	//http://localhost:8080/api/Registration
	@DeleteMapping("{id}")
	public void deleteReg(@PathVariable long id) {
		repo.deleteById(id);		
	}

}
