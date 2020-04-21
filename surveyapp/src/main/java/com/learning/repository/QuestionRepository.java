package com.learning.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.model.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Integer>{

}
