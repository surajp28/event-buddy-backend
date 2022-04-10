package com.example.eventbuddybackend.respositories;
import org.springframework.data.jpa.repository.Query;
import com.example.eventbuddybackend.models.User;
import com.example.eventbuddybackend.models.Userdetails;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("Select u from User u WHERE u.email_id = ?1")
    public User getUserByEmail(String email_id);
	
	@Query("Select u from User u WHERE u.user_id = ?1")
	public User getUserByUserId(long user_id);
    
	@Modifying
	@Query("Update User u set u.password=?2 WHERE u.email_id = ?1")
	public void updatePasswordByEmailid(String email_id,String password);
	
	@Modifying
	@Query("Update User u set u.first_name=?1,u.last_name=?2,u.dob=?3,u.email_id=?4,u.postal_code=?5,u.phone=?6 WHERE u.user_name=?7")
	public void updateUser(String first_name,String last_name,Date dob,String email_id,long postal_code,long phone,String user_name);

	@Query("Select u.first_name,u.last_name,u.dob,u.email_id,u.postal_code,u.phone FROM User u WHERE u.user_name=?1")
	public Userdetails getDetails(String user_name);
}

