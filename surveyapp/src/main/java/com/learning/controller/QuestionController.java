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

import com.learning.model.Questions;
import com.learning.service.QuestionService;

@RestController
@CrossOrigin("*")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/question")
	public List<Questions> getQuestions(){
		return questionService.getQuestions();
	}
	
	@GetMapping("/question/{id}")
	public Questions getQuestionById(@PathVariable int id){
		return questionService.getQuestionById(id);
	}
	
	@PostMapping("/question")
	public void addQuestion(@RequestBody Questions question) {
		questionService.addQuestion(question);
	}
	
	@PutMapping("/question")
	public void updateQuestion(@RequestBody Questions question) {
		questionService.updateQuestion(question);
	}
	
	@DeleteMapping("/question/{id}")
	public void deleteQuestion(@PathVariable int id) {
		questionService.deleteQuestion(id);
	}
	
}
