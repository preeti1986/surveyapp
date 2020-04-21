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
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Role;
import com.learning.model.User;
import com.learning.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/rest/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id){
		return userService.getUserById(id);
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@GetMapping("/user/{userId}/role")
	public List<Role> getRolesOfUser(@PathVariable int userId){
		return userService.getRolesOfUser(userId);
	}

	
}
