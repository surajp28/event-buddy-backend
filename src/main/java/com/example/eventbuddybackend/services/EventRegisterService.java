package com.example.eventbuddybackend.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventbuddybackend.models.EventRegister;
import com.example.eventbuddybackend.respositories.EventRegisterRepository;

@Service
public class EventRegisterService {
	
    @Autowired
    private EventRegisterRepository eventRegisterRepository;
    
	public String editRegistration(@Valid EventRegister eventRegister) {
		eventRegisterRepository.save(eventRegister);
		long user_id=eventRegister.getUser_id();
		long event_id=eventRegister.getEvent_id();
		String userEmail=eventRegisterRepository.getUserEmail(user_id);
		String eventOwnerEmail=eventRegisterRepository.getEventOwnerEmail(event_id);
		return userEmail+","+eventOwnerEmail;
		
	}

}
