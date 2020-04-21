package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, String>{

}
