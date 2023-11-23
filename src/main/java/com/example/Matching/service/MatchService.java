package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.TokenInfo;
import com.example.Matching.dto.response.MatchResponse;
import com.example.Matching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    public MatchResponse startRandomMatch(String accessToken) {

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
