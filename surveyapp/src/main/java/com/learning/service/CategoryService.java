package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.SurveyCategory;
import com.learning.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepo;
	
	public List<SurveyCategory> getCategorys() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	public SurveyCategory getCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.getOne(id);
	}

	public void addCategory(SurveyCategory category) {
		// TODO Auto-generated method stub
		categoryRepo.save(category);
	}

	public void updateCategory(SurveyCategory category) {
		// TODO Auto-generated method stub
		categoryRepo.save(categoryRepo.getOne(category.getCategory_id()));
	}

	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepo.delete(categoryRepo.getOne(id));
	}

}
