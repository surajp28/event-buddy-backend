package com.example.eventbuddybackend.respositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eventbuddybackend.dto.VenueRegisterDetailsDto;
import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.models.VenueRegisterDetails;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
	
	@Query("Select v from Venue v WHERE v.user_id = ?1")
	public List<Venue> getVenueByUserid(long user_id);

	@Query("Select new com.example.eventbuddybackend.dto.VenueRegisterDetailsDto(v.venue_name,e.eventname,u.first_name,e.date,e.time) "
			+ "From Venue v,Events e,User u "
			+ "WHERE v.venue_id=e.venue_id and "
			+ "e.user_id=u.user_id and "
			+ "u.user_id=?1")
	public List<VenueRegisterDetailsDto> getVenueReservationsById(long user_id);
	
}
