package com.example.Matching.dto.response;

import com.example.Matching.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatchResponse {

    private User attacker;
    private User depender;

}
