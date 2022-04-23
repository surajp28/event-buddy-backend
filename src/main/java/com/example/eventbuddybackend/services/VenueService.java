package com.example.eventbuddybackend.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventbuddybackend.dto.EditRegistrationDto;
import com.example.eventbuddybackend.dto.VenueRegisterDetailsDto;
import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.models.VenueRegisterDetails;
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

	public List<VenueRegisterDetailsDto> getVenueReservations(long user_id) {
		return venueRepository.getVenueReservationsById(user_id);
	}

	public String editRegistration(@Valid EditRegistrationDto editRegistrationDto) {
		String editType=editRegistrationDto.getEditType();
//		if(editType=="close") {
//			venueRepository.deleteEvents(editRegistrationDto.getEventname(),editRegistrationDto.getVenue_name());
//		}
//		else {
//			venueRepository.deleteEvents(editRegistrationDto.getEventname(),editRegistrationDto.getVenue_name());
//		}
//				
		return "Successful";
	}

}
