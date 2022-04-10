package com.example.eventbuddybackend.respositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eventbuddybackend.models.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
	
	@Query("Select v from Venue v WHERE v.user_id = ?1")
	public List<Venue> getVenueByUserid(long user_id);
}
