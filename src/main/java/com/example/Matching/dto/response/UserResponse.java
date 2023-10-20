package com.example.Matching.dto.response;

import com.example.Matching.domain.Species;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserResponse {

    private String id;
    @Id
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
