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

    public MatchResponse startRandomMatch(UUID uuid) {

//        List<UserResponse> all = userRepository.findAll();
//
//
//        int idx = (int) (Math.random() *all.size() + 1);
//
//        String depender = all.get(idx).getNickName();

        UserResponse attacker = userRepository.findById(uuid).get();

        UserResponse depender;
        while(true){

            depender=userRepository.findRandom();

            if(attacker.getUuid()!=depender.getUuid()){
                break;
            }

        }



        System.out.println(depender);



        return new MatchResponse(attacker,depender);

    }
}
