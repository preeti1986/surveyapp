package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.Survey;
import com.learning.repository.SurveyRepository;

@Service
public class SurveyService {
	
	@Autowired
	private SurveyRepository surveyRepo;

	public List<Survey> getSurveys() {
		// TODO Auto-generated method stub
		return surveyRepo.findAll();
	}

	public Survey getSurveyById(String id) {
		// TODO Auto-generated method stub
		return surveyRepo.getOne(id);
	}

	public void addSurvey(Survey survey) {
		// TODO Auto-generated method stub
		surveyRepo.save(survey);
	}

	public void updateSurvey(Survey survey) {
		// TODO Auto-generated method stub
		surveyRepo.save(surveyRepo.getOne(survey.getSurvey_id()));
	}

	public void deleteSurvey(String id) {
		// TODO Auto-generated method stub
		surveyRepo.delete(surveyRepo.getOne(id));
	}

}
