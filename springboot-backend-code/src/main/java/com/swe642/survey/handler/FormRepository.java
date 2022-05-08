package com.swe642.survey.handler;

import org.springframework.data.jpa.repository.JpaRepository;

//extending the predefined interface "JpaRepository" so we can gain access to standard spring data jpa CRUD methods
public interface FormRepository extends JpaRepository<Form, Integer>{

}
