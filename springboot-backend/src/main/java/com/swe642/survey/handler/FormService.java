package com.swe642.survey.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
	
	@Autowired
	private FormRepository repo;
	
	public List<Form> getAllSubmissions() {
		List<Form> submissions = new ArrayList<>();
		repo.findAll().forEach(submissions::add);
		return submissions;
	}
	
	
	public void saveSubmission(Form form) {
		repo.save(form);
	}
	
	

}
