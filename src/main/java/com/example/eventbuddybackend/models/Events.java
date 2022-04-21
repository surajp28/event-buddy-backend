package com.example.eventbuddybackend.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity // This tells Hibernate to make a table out of this class
@Table(name="events")
public class Events {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private long event_id;
	
    @Column(name="eventname")
    private String eventname;
    
    @Column(name="venue_id")
    private long venue_id;

	@Column(name="eventdesc")
    private String eventdesc;

    @Column(name="price")
    private long price;

    @Column(name="category")
    private String category;
    
    @Column(name="user_id")
    private long user_id;
    

    @Column(name="time")
    private long time;
    
    @Column(name="date")
    private Date date;


	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getEvent_id() {
		return event_id;
	}

	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public long getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(long venue_id) {
		this.venue_id = venue_id;
	}

	public String getEventdesc() {
		return eventdesc;
	}

	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
}
