package com.example.Matching.repository;

import com.example.Matching.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByUserUUID(UUID userUUID);

    @Query("SELECT u From User u" +
            " where u.uuid!=:uuid order by RAND() limit 1")
    Optional<User> findRandom(UUID uuid);

//    UserResponse findByNickName(String nickname);

}
