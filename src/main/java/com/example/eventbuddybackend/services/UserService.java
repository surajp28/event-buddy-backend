package com.example.eventbuddybackend.services;

import com.example.eventbuddybackend.dto.UserDto;
import com.example.eventbuddybackend.models.User;
import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.respositories.UserRepository;
import com.example.eventbuddybackend.tools.MD5Utils;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

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
	                return role + " " +  existinguser.getUser_id();
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
    
    @Transactional
   	public String updateUserDetails(@Valid User user) {
       	String username=user.getUser_name();
       	String first_name=user.getFirst_name();
       	String last_name=user.getLast_name();
       	Date dob=user.getDob();
       	String email_id=user.getEmail_id();
       	long postal_code=user.getPostal_code();
       	long phone=user.getPhone();
       	userRepository.updateUser(first_name,last_name,dob,email_id,postal_code,phone,username);
       	return "Successful";
       }

    public UserDto getUserByUserid(long user_id) {
       	return userRepository.getUserByUserId(user_id);
       }

	public List<UserDto> listAllUsers() {
		return userRepository.findAllUsers();
	}
}


