package com.example.eventbuddybackend.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventbuddybackend.models.Events;
import com.example.eventbuddybackend.respositories.EventRepository;

@Service
public class EventService {
	@Autowired
    private EventRepository eventRepository;

	public List<Events> listAllEvents() {
		return eventRepository.findAll();
	}

	public void saveEvent(@Valid Events event) {
		eventRepository.save(event);
	}

	public List<Events> getEvent(long user_id) {
		return eventRepository.getEventByUserid(user_id);
	}
	
}
