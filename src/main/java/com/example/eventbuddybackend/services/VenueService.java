package com.example.eventbuddybackend.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.respositories.VenueRepository;

@Service
public class VenueService {
	@Autowired
    private VenueRepository venueRepository;

	public List<Venue> listAllVenues() {
		return venueRepository.findAll();
	}

	public String saveVenue(@Valid Venue venue) {
		venueRepository.save(venue);
		return "Successful";
	}
	
	public List<Venue> getVenue(long user_id) {
		return venueRepository.getVenueByUserid(user_id);
	}
}
