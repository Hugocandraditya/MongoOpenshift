package com.example.tutorialno2.service;


import com.example.tutorialno2.model.User;
import com.example.tutorialno2.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
	@Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User addUser(User user) {
        return this.userRepository.insert(user);
    }
    
    public User updateUser(User user, String id) {
    	user.setId(id);
        return this.userRepository.save(user);
    }
    
    public String deleteUser(String id) {
        this.userRepository.deleteById(id);
        return "Deleted" + id;
    }
}