package com.example.Matching.dto.response;

import com.example.Matching.domain.Species;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserResponse {

    @Id
    @GeneratedValue
    private UUID uuid;

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
