package com.example.tutorialno2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorialno2.model.User;
import com.example.tutorialno2.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;



    @GetMapping
    public String helloUsers() {
        return "HAI";
    }
    
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    @ResponseBody()
    public User addNewUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    
    @PutMapping("/updateuser/{id}")
    @ResponseBody()
    public User updateUser(@RequestBody User user, @PathVariable String id) {
        return this.userService.updateUser(user, id);
    }
    
    @DeleteMapping("deleteuser/{id}")
    public String deleteUser(@PathVariable String id) {
    	return this.userService.deleteUser(id);
    }
}
