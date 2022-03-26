package com.example.eventbuddybackend.respositories;
import com.example.eventbuddybackend.models.VerifyCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationCodeRepository extends JpaRepository<VerifyCode,Long> {
    @Query("Select p from VerifyCode p WHERE p.code = ?1")
    public VerifyCode getUserByCode(String email);
}