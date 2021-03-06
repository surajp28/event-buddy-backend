package com.example.eventbuddybackend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventbuddybackend.dto.EditRegistrationDto;
import com.example.eventbuddybackend.dto.VenueRegisterDetailsDto;
import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.models.VenueRegisterDetails;
import com.example.eventbuddybackend.respositories.VenueRepository;
import com.example.eventbuddybackend.services.EventService;
import com.example.eventbuddybackend.services.VenueService;

@RestController
@CrossOrigin(origins = "*")
public class VenueController {
	@Autowired
	VenueService venueService;
	
	@Autowired
	EventService eventservice;
	
	@Autowired
	VenueRepository venueRepository;
	
    @GetMapping("/venue/findAll")
    public List<Venue> getAllVenues() {
        return venueService.listAllVenues();
    }
    
    @PostMapping("/venue/add")
    public String addVenue(@Valid @RequestBody Venue venue) {
    	return venueService.saveVenue(venue);
    }
    
    @GetMapping(value="/venue/{userid}")
    public List<Venue> getVenue(@PathVariable("userid") long userid) {
    	return venueService.getVenue(userid);
    }
    
    @GetMapping(value="/venue/findSlot/{venue_id}")
	@CrossOrigin
    public List<Long> getVenueSlots(@PathVariable("venue_id") long venue_id) {
    	return eventservice.getVenueSlot(venue_id);
    }
    
    @GetMapping(value="/venue/getVenueReservations/{user_id}")
	@CrossOrigin
    public List<VenueRegisterDetailsDto> getVenueReservations(@PathVariable("user_id") long user_id) {
    	return venueService.getVenueReservations(user_id);
    }
    
    @PostMapping(value="/venue/editRegistration")
	@CrossOrigin
    public String editRegistration(@Valid @RequestBody EditRegistrationDto editRegistrationDto) {
    	return venueService.editRegistration(editRegistrationDto);
    }
    
}
