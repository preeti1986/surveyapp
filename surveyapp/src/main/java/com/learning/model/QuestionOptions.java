package com.learning.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_questionoptions")
public class QuestionOptions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int option_id;
	
	private String options;
	
	@Embedded
	Tracker tracker;
	
	@ManyToOne
	private Questions question;
}
