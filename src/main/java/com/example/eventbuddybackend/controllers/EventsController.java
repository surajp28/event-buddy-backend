package com.example.eventbuddybackend.controllers;

import java.util.List;

import javax.validation.Valid;

import com.example.eventbuddybackend.models.Events;
import com.example.eventbuddybackend.models.Venue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventbuddybackend.respositories.EventRepository;
import com.example.eventbuddybackend.services.EventService;

@RestController
@CrossOrigin(origins = "*")
public class EventsController {
	@Autowired
	EventService eventService;
	
	@Autowired
	EventRepository eventRepository;
	
    @GetMapping("/events/findAll")
    public List<Events> getAllEvents() {
        return eventService.listAllEvents();
    }
    
    @PostMapping("/events/add")
    public String addEvent(@Valid @RequestBody Events event) {
    	eventService.saveEvent(event);
        return "Successful";
    }
    
    @GetMapping(value="/events/{userid}")
    public List<Events> getEvent(@PathVariable("userid") long userid) {
    	return eventService.getEvent(userid);
    }
    
    
}
