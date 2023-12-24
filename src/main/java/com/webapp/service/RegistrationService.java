package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.Repository.RegistrationRepository;
import com.webapp.entity.Registration;

@Service
public class RegistrationService {
 
    @Autowired
	private RegistrationRepository repo;

	public void SaveReg(Registration reg) {
		repo.save(reg);		
	}

	public List<Registration> AllRegistration() {
		List<Registration> findAll = repo.findAll();
		return findAll;
	}

	public void deleteReg(long id) {
		repo.deleteById(id);		
	}

	public Registration GetReg(long id) {
		Registration registration = repo.findById(id).get();		
		return registration;
	}

	public void updatereg(Registration registration) {
		repo.save(registration);		
	}
    
}
