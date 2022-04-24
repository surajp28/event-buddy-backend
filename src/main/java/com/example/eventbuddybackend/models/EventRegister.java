package com.example.eventbuddybackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(RegisterId.class)
@Table(name="eventregister")
public class EventRegister {

	@Id
    @Column(name="user_id")
    private long user_id;
	
	@Id
    @Column(name="event_id")
    private long event_id;
    
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getEvent_id() {
		return event_id;
	}

	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}

}
