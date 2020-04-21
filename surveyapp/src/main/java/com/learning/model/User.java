package com.learning.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_user")
public class User implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2657053461685324831L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@NotNull
	private String firstname;
	private String lastname;
	
	@NotNull
	private String username;
	
	@Column(unique=true)
	@NotNull
	private String password;
	
	@Column(unique=true)
	@NotNull
	private String email;
	
	@NotNull
	private int status;
	
	@Embedded
	@JsonProperty("user_details")
	Tracker tracker;
	
	@ManyToMany(mappedBy = "user",fetch = FetchType.EAGER)
	@JsonIgnoreProperties("user")
	private Set<Role> role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		 List<GrantedAuthority> authorities
	      = new ArrayList<>();
	    for (Role role: this.role) {
	        authorities.add(new SimpleGrantedAuthority(role.getRole()));       
	    }
	     
	    return authorities; 
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
