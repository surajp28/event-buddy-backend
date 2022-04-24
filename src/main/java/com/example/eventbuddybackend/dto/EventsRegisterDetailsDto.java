package com.example.eventbuddybackend.dto;

import java.time.LocalDate;

import javax.persistence.Column;

public class EventsRegisterDetailsDto {

    private String eventname;
    
    private String venue_name;

    private String eventdesc;

    private long time;

    private LocalDate date;

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getEventdesc() {
		return eventdesc;
	}

	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public EventsRegisterDetailsDto(String eventname, String venue_name, String eventdesc, long time, LocalDate date) {
		super();
		this.eventname = eventname;
		this.venue_name = venue_name;
		this.eventdesc = eventdesc;
		this.time = time;
		this.date = date;
	}
    
}
