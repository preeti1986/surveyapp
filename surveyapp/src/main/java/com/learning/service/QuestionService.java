package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.Questions;
import com.learning.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questRepo;

	public List<Questions> getQuestions() {
		// TODO Auto-generated method stub
		return questRepo.findAll();
	}

	public Questions getQuestionById(int id) {
		// TODO Auto-generated method stub
		return questRepo.getOne(id);
	}

	public void addQuestion(Questions question) {
		// TODO Auto-generated method stub
			questRepo.save(question);
	}

	public void updateQuestion(Questions question) {
		// TODO Auto-generated method stub
		questRepo.save(questRepo.getOne(question.getQuestion_id()));
		
	}

	public void deleteQuestion(int id) {
		// TODO Auto-generated method stub
		questRepo.delete(questRepo.getOne(id));
	}

}
