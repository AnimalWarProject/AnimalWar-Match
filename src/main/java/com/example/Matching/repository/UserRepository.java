package com.example.Matching.repository;

import com.example.Matching.dto.response.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserResponse, String> {

    @Query("SELECT u From UserResponse u order by RAND() limit 1")
    UserResponse findRandom();

    UserResponse findByNickName();
}
