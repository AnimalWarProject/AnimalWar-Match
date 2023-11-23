package com.example.Matching.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor
@Builder @Getter
public class TokenInfo {
    private UUID userUUID;
    private String id;
    private String nickName;

}

