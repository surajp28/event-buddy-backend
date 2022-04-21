package com.example.eventbuddybackend.respositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eventbuddybackend.models.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {
	
	@Query("Select e from Events e WHERE e.user_id = ?1")
	public List<Events> getEventByUserid(long user_id);
	
	@Query("Select e.time from Events e WHERE e.venue_id=?1")
	public List<Long> getVenueSlotById(long venue_id);

}
