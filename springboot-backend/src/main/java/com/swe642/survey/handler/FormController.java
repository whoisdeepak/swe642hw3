package com.swe642.survey.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class FormController {
	
	@Autowired
	public FormService service;
	
	@GetMapping("/list")
	public List<Form> getAllSubmissions() {
		return service.getAllSubmissions();
	}
	
	@PostMapping("/submit")
	public void insertSubmission(@RequestBody Form form) {
		service.saveSubmission(form);
	}
	
	
}
