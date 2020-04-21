package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Survey;
import com.learning.service.SurveyService;

@RestController
@CrossOrigin("*")
public class SurveyController {

	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/survey")
	public List<Survey> getSurveys(){
		return surveyService.getSurveys();
	}
	
	@GetMapping("/survey/{id}")
	public Survey getSurveyById(@PathVariable String id){
		return surveyService.getSurveyById(id);
	}
	
	@PostMapping("/survey")
	public void addSurvey(@RequestBody Survey survey) {
		surveyService.addSurvey(survey);
	}
	
	@PutMapping("/survey")
	public void updateSurvey(@RequestBody Survey survey) {
		surveyService.updateSurvey(survey);
	}
	
	@DeleteMapping("/survey/{id}")
	public void deleteSurvey(@PathVariable String id) {
		surveyService.deleteSurvey(id);
	}
	
}
