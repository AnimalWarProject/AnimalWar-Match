package com.example.Matching.controller;

import com.example.Matching.dto.request.MatchRequest;
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
    public void randomMatch(@RequestBody MatchRequest matchRequest){

        service.startRandomMatch(matchRequest.getNickname());
    }

    @GetMapping
    public void test(){

    }
}
