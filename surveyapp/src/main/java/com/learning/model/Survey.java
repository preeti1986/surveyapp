package com.learning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import com.learning.utility.SurveyIdGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_survey")
public class Survey {

	@Id
	@GenericGenerator(name = "survey_seq",strategy = "com.learning.utility.SurveyIdGenerator",
			parameters = {
		            @Parameter(name = SurveyIdGenerator.INCREMENT_PARAM, value = "1"),
		            @Parameter(name = SurveyIdGenerator.VALUE_PREFIX_PARAMETER, value = "S_"),
		            @Parameter(name = SurveyIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
	@GeneratedValue(generator = "survey_seq" , strategy = GenerationType.SEQUENCE)
	private String survey_id;
	
	@Column(name="survey_name",unique = true)
	@NotNull
	private String surveyName;
	
	@Column(name="no_of_questions")
	@NotNull
	private int noOfQuestions;
	
	@Column(name="max_no_of_questions")
	@NotNull
	private int maxNoOfQuestions;
	
	@OneToMany(mappedBy = "survey")
	private List<SurveyCategory> category;
}
