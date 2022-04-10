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

import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.respositories.VenueRepository;
import com.example.eventbuddybackend.services.VenueService;

@RestController
@CrossOrigin(origins = "*")
public class VenueController {
	@Autowired
	VenueService venueService;
	
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
    
}
