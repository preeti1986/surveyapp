package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.Role;
import com.learning.model.User;
import com.learning.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(userRepo.getOne(user.getUser_id()));
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepo.delete(userRepo.getOne(id));
	}

	public List<Role> getRolesOfUser(int userId) {
		// TODO Auto-generated method stub
		return userRepo.getRolesOfUser(userId);
	}

}
