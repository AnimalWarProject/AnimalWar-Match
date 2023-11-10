package com.example.Matching.controller;

import com.example.Matching.dto.request.MatchRequest;
import com.example.Matching.dto.response.MatchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.Matching.service.MatchService;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/match")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService service;

    @PostMapping
    public MatchResponse randomMatch(@RequestHeader("Authorization") String accessToken){

        return service.startRandomMatch(accessToken.replace("Bearer ", ""));
    }


//    @PostMapping
//    public MatchResponse randomMatch(@RequestBody MatchRequest matchRequest){
//
//        return service.startRandomMatch(matchRequest.getToken);
//    }

    @GetMapping
    public void test(){

    }
}
