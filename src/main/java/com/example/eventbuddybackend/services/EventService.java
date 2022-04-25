package com.example.eventbuddybackend.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
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
	
	public List<Long> getVenueSlot(long venue_id) {
		List<Long> currentslots= new ArrayList<Long>();
		List<Long> availableslots= new ArrayList<Long>();
		currentslots=eventRepository.getVenueSlotById(venue_id);
		for(long i=0;i<23;i++) {
			if (!currentslots.contains(i)) {availableslots.add(i);}
		}
		return availableslots;
	}
	
	@Transactional
	public String updateBookmark(long event_id) {
		eventRepository.updateBookmark(event_id);
		// TODO Auto-generated method stub
		return "Successful";
	}
	
}
