package com.example.Matching.controller;

import com.example.Matching.dto.response.MatchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.Matching.service.MatchService;

@RestController
@RequestMapping("api/v1/match")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService service;

    @PostMapping
    public MatchResponse randomMatch(@RequestHeader("Authorization") String accessToken){
        System.out.println(accessToken);

        return service.startRandomMatch(accessToken.replace("Bearer ", ""));
    }


    @GetMapping
    public void test(){

    }
}
