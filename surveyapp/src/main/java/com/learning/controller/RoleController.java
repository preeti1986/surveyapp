package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Role;
import com.learning.model.User;
import com.learning.service.RoleService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/rest/")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role")
	public List<Role> getRoles(){
		return roleService.getRoles();
	}
	
	@GetMapping("/role/{id}")
	public Role getRoleById(@PathVariable int id){
		return roleService.getRoleById(id);
	}
	
	@PostMapping("/role")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
	
	@PutMapping("/role")
	public void updateRole(@RequestBody Role role) {
		roleService.updateRole(role);
	}
	
	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable int id) {
		roleService.deleteRole(id);
	}
	
	@GetMapping("/role/{roleId}/user")
	public List<User> getUsersByRole(@PathVariable int roleId){
		return roleService.getUsersByRole(roleId);
	}

}
