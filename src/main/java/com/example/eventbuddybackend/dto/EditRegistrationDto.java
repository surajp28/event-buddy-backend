package com.example.eventbuddybackend.dto;

public class EditRegistrationDto {
    private String venue_name;

    private String eventname;
    
    private String editType;

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

	public String getEditType() {
		return editType;
	}

	public void setEditType(String editType) {
		this.editType = editType;
	}

	public EditRegistrationDto(String venue_name, String eventname, String editType) {
		super();
		this.venue_name = venue_name;
		this.eventname = eventname;
		this.editType = editType;
	}
}
