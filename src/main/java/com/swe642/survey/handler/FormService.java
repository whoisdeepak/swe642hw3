package com.swe642.survey.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
	
	//injecting FormRepository into service class using @Autowired 
	@Autowired
	private FormRepository repo;
	
	public List<Form> getAllSubmissions() {
		return repo.findAll(); //calling the predefined spring data jpa method called "findAll" which performs select query on db
	}
	
	
	public void saveSubmission(Form form) {
		repo.save(form); //calling the predefined spring data jpa method called "save" which performs insert/update query on db
	}
	
	

}
