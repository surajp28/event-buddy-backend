package com.example.eventbuddybackend.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventbuddybackend.models.EventRegister;
import com.example.eventbuddybackend.services.EventRegisterService;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {
	@Autowired
	EventRegisterService eventRegisterService;
	
	 @PostMapping(value="/venue/registerevent")
		@CrossOrigin
	    public String eventRegistration(@Valid @RequestBody EventRegister eventRegister) {
	    	return eventRegisterService.editRegistration(eventRegister);
	    }
}
