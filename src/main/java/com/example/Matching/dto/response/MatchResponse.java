package com.example.Matching.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class MatchResponse {

    private UUID attacker;
    private UUID depender;

}
