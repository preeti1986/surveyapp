package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.model.SurveyCategory;

public interface CategoryRepository extends JpaRepository<SurveyCategory, Integer>{

}
