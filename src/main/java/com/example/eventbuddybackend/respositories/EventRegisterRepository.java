package com.example.eventbuddybackend.respositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eventbuddybackend.models.EventRegister;

@Repository
public interface EventRegisterRepository extends JpaRepository<EventRegister, Long>{

	@Query("SELECT u.email_id FROM User u WHERE u.user_id=?1 ")
	String getUserEmail(long user_id);

	@Query("SELECT u.email_id FROM User u,Events e WHERE e.user_id=u.user_id AND e.event_id=?1")
	String getEventOwnerEmail(long event_id);

}
