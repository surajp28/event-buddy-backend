package com.example.eventbuddybackend.models;

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
@Table(name="venue")
public class Venue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="venue_id")
    private long venue_id;
	
    @Column(name="venue_name")
    private String venue_name;
    
    @Column(name="pincode")
    private long pincode;

	@Column(name="description")
    private String description;
	
	@Column(name="price")
	private long price;
	
    @Column(name="user_id")
    private long user_id;


	public long getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(long venue_id) {
		this.venue_id = venue_id;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getDescription() {
		return description;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
