package com.learning.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
public class Tracker {
	
	@Column(name="date_created")
	private Date dateCreated;
	
	@Column(name="date_updated")
	private Date dateUpdated;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "created_by")
	private User created_by;
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="modified_by")
	private User modified_by;
	
}
