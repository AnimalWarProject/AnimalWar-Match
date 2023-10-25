package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.TokenInfo;
import com.example.Matching.repository.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JwtService {

    private final UserRepository userRepository;

    @Value("${jwt.secret}")
    private String secret;

    public TokenInfo parseAccessToken(String accessToken) {
        Claims body = Jwts.parserBuilder()
                .setSigningKey(secret.getBytes())
                .build()
                .parseClaimsJws(accessToken)
                .getBody();


        UUID userUUID = UUID.fromString(body.get("userUUID", String.class));
        User user = userRepository.findById(userUUID).orElse(null);


        return TokenInfo.builder()
                .userUUID(user.getUuid())
                .id(user.getId())
                .nickName(user.getNickName())
                .build();
    }
}
