package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.TokenInfo;
import com.example.Matching.dto.response.MatchResponse;

import com.example.Matching.repository.UserRepository;
import io.jsonwebtoken.Jwt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public MatchResponse startRandomMatch(String accessToken) {

//        List<UserResponse> all = userRepository.findAll();
//
//
//        int idx = (int) (Math.random() *all.size() + 1);
//
//        String depender = all.get(idx).getNickName();

        TokenInfo tokenInfo = jwtService.parseAccessToken(accessToken);

        User attacker = userRepository.findById(tokenInfo.getUserUUID()).orElseThrow(
                ()->new RuntimeException("No Attacker")
        );

        User depender = userRepository.findRandom(tokenInfo.getUserUUID()).orElseThrow(
                ()->new RuntimeException("No Depender")
        );
        System.out.println(depender);

        return new MatchResponse(attacker,depender);

    }
}
