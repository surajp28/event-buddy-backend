package com.example.eventbuddybackend.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EventRegister {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long userid;
	
    @Column(name="event_id")
    private String event_id;
    
    @Column(name="timeslot")
    private Date timeslot;

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public Date getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(Date timeslot) {
		this.timeslot = timeslot;
	}

}
