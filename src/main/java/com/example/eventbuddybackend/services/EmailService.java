package com.example.eventbuddybackend.services;

import com.example.eventbuddybackend.models.EmailDetails;

public interface EmailService {
	 
    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
