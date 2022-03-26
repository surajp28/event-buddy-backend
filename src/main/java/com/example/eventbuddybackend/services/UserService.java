package com.example.eventbuddybackend.services;

import com.example.eventbuddybackend.models.User;
import com.example.eventbuddybackend.respositories.UserRepository;
import com.example.eventbuddybackend.tools.MD5Utils;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    
    //login
    public String validateUser(User user) {
    	User existinguser=userRepository.getUserByEmail(user.getEmail_id());
    	if(existinguser==null)
    		return "Invalid email";
    	else {
	        //String passwordU = user.getPassword();// encrypt the password to compare
	        String passwordU=MD5Utils.inputPassToFormPass(user.getPassword());
	        if(existinguser.getPassword().equals(passwordU)) {
	        	String role=existinguser.getRole();
	                return "Login Successful";
	        }
	        return "Incorrect password";
    	}
    }

    //Signup
    public String saveUser(User user) {
    	User existinguser=userRepository.getUserByEmail(user.getEmail_id());
    	if(existinguser!=null) {
    		return "Username already exists";
    	}
    	else{
    		user.setPassword(MD5Utils.inputPassToFormPass(user.getPassword()));
    		userRepository.save(user);
    		return "Registration sucessful";
    	}
    }
    
    //reset password
    @Transactional 
    public String updatePassword(User user) {
    	User existinguser=userRepository.getUserByEmail(user.getEmail_id());
    	if(existinguser==null)
    		return "Invalid email";
    	else {
    		user.setPassword(MD5Utils.inputPassToFormPass(user.getPassword()));
    		userRepository.updatePasswordByEmailid(user.getEmail_id(),user.getPassword());
        	return "Successful";
    	}
    }
}


