package com.example.Matching.dto.response;

import com.example.Matching.domain.Species;
import lombok.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String nickName;
    private int food;
    private int iron;
    private int wood;
    private int gold;

    private int attackPower;
    private int defensePower;
    private int battlePoint;

    private String profileImage;

    private Species species;
}
