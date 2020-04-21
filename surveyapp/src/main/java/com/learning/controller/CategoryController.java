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

import com.learning.model.SurveyCategory;
import com.learning.service.CategoryService;

@RestController
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/category")
	public List<SurveyCategory> getCategorys(){
		return categoryService.getCategorys();
	}
	
	@GetMapping("/category/{id}")
	public SurveyCategory getCategoryById(@PathVariable int id){
		return categoryService.getCategoryById(id);
	}
	
	@PostMapping("/category")
	public void addCategory(@RequestBody SurveyCategory category) {
		categoryService.addCategory(category);
	}
	
	@PutMapping("/category")
	public void updateCategory(@RequestBody SurveyCategory category) {
		categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable int id) {
		categoryService.deleteCategory(id);
	}
	
}
