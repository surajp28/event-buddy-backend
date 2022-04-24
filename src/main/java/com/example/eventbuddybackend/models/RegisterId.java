package com.example.eventbuddybackend.models;

import java.io.Serializable;

public class RegisterId implements Serializable {

	private long user_id;
    private long event_id;
    public RegisterId(long user_id, long event_id) {
		super();
		this.user_id = user_id;
		this.event_id = event_id;
	}
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
	public RegisterId() {
		super();
	}

}
