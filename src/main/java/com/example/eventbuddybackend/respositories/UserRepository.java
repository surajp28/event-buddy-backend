package com.example.eventbuddybackend.respositories;
import org.springframework.data.jpa.repository.Query;
import com.example.eventbuddybackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("Select u from User u WHERE u.email_id = ?1")
    public User getUserByEmail(String email_id);
	
	@Query("Select u from User u WHERE u.user_name = ?1")
	public User getUserByUsername(String username);
    
	@Modifying
	@Query("Update User u set u.password=?2 WHERE u.email_id = ?1")
	public void updatePasswordByEmailid(String email_id,String password);
}

