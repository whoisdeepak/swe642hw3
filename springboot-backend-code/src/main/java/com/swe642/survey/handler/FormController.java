package com.swe642.survey.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//this is the class which intercepts incoming REST API requests

@RestController //without this annotation, sending REST calls to http://localhost:8080 will show a default error page rendered by spring boot internally.
@CrossOrigin(origins="*")
public class FormController {
	
	//injecting FormService into controller class using @Autowired
	@Autowired
	public FormService service;
	
	//get REST api requests are intercepted using @GetMapping
	@GetMapping("/list")
	public List<Form> getAllSubmissions() {
		return service.getAllSubmissions();
	}
	
	
	//post REST api requests are intercepted using @PostMapping
	@PostMapping("/submit")
	public void insertSubmission(@RequestBody Form form) {
		service.saveSubmission(form);
	}
	
	
}
