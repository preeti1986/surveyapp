package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learning.model.Role;
import com.learning.model.User;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	@Query("select r.user from Role r inner join r.user where r.role_id = :roleId")
	List<User> getUsersByRole(@Param("roleId") int roleId);

}
