package com.learning.model;

import java.util.List;

import javax.persistence.Column;
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
@Table(name = "tbl_surveycategory")
public class SurveyCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	
	@Column(unique=true)
	@NotNull
	private String category_name;
	
	@ManyToOne
	private Survey survey;
	
	@OneToMany(mappedBy = "category")
	private List<Questions> questions;
	
	@Embedded
	Tracker tracker;
	
}
