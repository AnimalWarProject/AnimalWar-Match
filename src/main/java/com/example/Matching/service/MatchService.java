package com.example.Matching.service;

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

    public MatchResponse startRandomMatch(String userName) {

//        List<UserResponse> all = userRepository.findAll();
//
//
//        int idx = (int) (Math.random() *all.size() + 1);
//
//        String depender = all.get(idx).getNickName();

        UserResponse attacker = userRepository.findByNickName();

        UserResponse depender = userRepository.findRandom();

        System.out.println(depender);



        return new MatchResponse(attacker,depender);

    }
}
