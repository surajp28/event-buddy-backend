package com.example.eventbuddybackend.respositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eventbuddybackend.dto.EventsRegisterDetailsDto;
import com.example.eventbuddybackend.dto.VenueRegisterDetailsDto;
import com.example.eventbuddybackend.models.Venue;
import com.example.eventbuddybackend.models.VenueRegisterDetails;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
	
	@Query("Select v from Venue v WHERE v.user_id = ?1")
	public List<Venue> getVenueByUserid(long user_id);

	@Query("Select new com.example.eventbuddybackend.dto.VenueRegisterDetailsDto(v.venue_name,e.eventname,u.first_name,e.date,e.time) "
			+ "FROM Venue v,Events e,User u "
			+ "WHERE v.venue_id=e.venue_id and "
			+ "e.user_id=u.user_id and "
			+ "u.user_id=?1")
	public List<VenueRegisterDetailsDto> getVenueReservationsById(long user_id);

	@Query("Select new com.example.eventbuddybackend.dto.EventsRegisterDetailsDto(e.eventname,v.venue_name,e.eventdesc,e.time,e.date) "
			+ "FROM Venue v,Events e "
			+ "WHERE v.venue_id=e.venue_id and "
			+ "e.user_id=?1")
	public List<EventsRegisterDetailsDto> getEventsOrganized(long userid);
	
	@Query("Select new com.example.eventbuddybackend.dto.EventsRegisterDetailsDto(e.eventname,v.venue_name,e.eventdesc,e.time,e.date) "
			+ "FROM Venue v,Events e,EventRegister r "
			+ "WHERE v.venue_id=e.venue_id and "
			+ "r.event_id=e.event_id "
			+ "and r.user_id=?1")
	public List<EventsRegisterDetailsDto> getEventsRegistered(long userid);
	

//	@Modifying
//	@Query("DELETE e "
//			+ "FROM venue v,events e "
//			+ "WHERE v.venue_id=e.venue_id "
//			+ "AND v.venue_name=?2 and "
//			+ "e.eventname=?1")
//	public void c(String eventname, String venue_name);

//	@Modifying
//	@Query("Delete v "
//			+ "FROM Venue v"
//			+ "And v.venue_name=?2" )
//	public void deleteEvents(String eventname, String venue_name);
//	
//	@Modifying
//	@Query("Delete "
//			+ "FROM Venue v,Events e "
//			+ "WHERE v.venue_id=e.venue_id "
//			+ "AND e.eventname=?1 "
//			+ "AND v.venue_name=?2")
//	public void deleteEvents(String eventname, String venue_name);
}
