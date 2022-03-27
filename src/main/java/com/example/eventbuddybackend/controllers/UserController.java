package com.example.eventbuddybackend.controllers;

import com.example.eventbuddybackend.models.User;
import com.example.eventbuddybackend.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
    @PostMapping("/users/login")
    public String loginUser(@Valid @RequestBody User user){
    	return userService.validateUser(user);
    }
    
    @PostMapping("/users/signup")
    public String signupUser(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }
    
    @PostMapping("/users/passwordReset")
    public String passwordReset(@Valid @RequestBody User user) {
    	return userService.updatePassword(user);
    }
}