package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.Role;
import com.learning.model.User;
import com.learning.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepo;

	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}

	public void addRole(Role role) {
		// TODO Auto-generated method stub
		roleRepo.save(role);
	}

	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		roleRepo.save(roleRepo.getOne(role.getRole_id()));
	}

	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		return roleRepo.getOne(id);
	}

	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		roleRepo.deleteById(id);
	}

	public List<User> getUsersByRole(int roleId) {
		// TODO Auto-generated method stub
		return roleRepo.getUsersByRole(roleId);
	}

}
