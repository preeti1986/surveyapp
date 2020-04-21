package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learning.model.Role;
import com.learning.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select distinct u.role from User u inner join u.role where u.user_id = :userId")
	List<Role> getRolesOfUser(@Param("userId") int userId);

	User findByUsername(String username);
}
