package com.example.eventbuddybackend.dto;

import java.util.Date;

import javax.persistence.Column;

public class UserDto {

    private long user_id;
	
    private String user_name;

    private String first_name;

    private String last_name;

    private Date dob;

    private String email_id;

    private long postal_code;

    private long phone;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(long postal_code) {
		this.postal_code = postal_code;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public UserDto(long user_id, String user_name, String first_name, String last_name, Date dob, String email_id,
			long postal_code, long phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.email_id = email_id;
		this.postal_code = postal_code;
		this.phone = phone;
	}

}
