package com.example.eventbuddybackend.controllers;

import com.example.eventbuddybackend.models.User;
import com.example.eventbuddybackend.respositories.UserRepository;
import com.example.eventbuddybackend.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
    @PostMapping("/users/login")
    @CrossOrigin
    public String loginUser(@Valid @RequestBody User user){
    	return userService.validateUser(user);
    }
    
    @PostMapping("/users/signup")
    @CrossOrigin
    public String signupUser(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }
    
    @PostMapping("/users/passwordReset")
    @CrossOrigin
    public String passwordReset(@Valid @RequestBody User user) {
    	return userService.updatePassword(user);
    }
}