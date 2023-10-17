package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.response.MatchResponse;
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


        int idx = (int) (Math.random() *all.size() + 1);

        UUID depender = all.get(idx).getUserUUID();

        System.out.println(depender);



        return new MatchResponse(userID,depender);

    }
}
