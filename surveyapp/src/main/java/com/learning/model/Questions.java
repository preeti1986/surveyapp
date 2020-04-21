package com.learning.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int question_id;
	
	@NotNull
	private String question;
	
	@Embedded
	Tracker tracker;
	
	@ManyToOne
	SurveyCategory category;
	
	@OneToMany(mappedBy = "question")
	private List<QuestionOptions> options;
}
