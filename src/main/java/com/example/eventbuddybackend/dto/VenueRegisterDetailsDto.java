package com.example.eventbuddybackend.dto;

import java.util.Date;

public class VenueRegisterDetailsDto {
	
    private String venue_name;

    private String eventname;
    
	private String first_name;
    
    private Date date;
    
    private long time;

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public VenueRegisterDetailsDto(String venue_name, String eventname, String first_name, Date date, long time) {
		super();
		this.venue_name = venue_name;
		this.eventname = eventname;
		this.first_name = first_name;
		this.date = date;
		this.time = time;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
