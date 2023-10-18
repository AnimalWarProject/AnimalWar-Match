package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.response.MatchResponse;
import com.example.Matching.dto.response.UserResponse;
import com.example.Matching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final UserRepository userRepository;

    public MatchResponse startRandomMatch(UUID userID) {

        List<User> all = userRepository.findAll();


        User attacker = userRepository.findById(userID).orElseThrow(() -> new RuntimeException("유저가 없어요"));

        int idx = (int) (Math.random() *all.size());

        User depender = all.get(idx);
//        UUID depender = user.getUserUUID();


        System.out.println(depender);






        return new MatchResponse(attacker,depender);

    }
}
