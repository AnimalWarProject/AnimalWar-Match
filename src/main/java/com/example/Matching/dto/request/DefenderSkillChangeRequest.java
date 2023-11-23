package com.example.Matching.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DefenderSkillChangeRequest {
    private String defenderAttackTypeSkill;
    private String defenderDefensiveTypeSkill;
    private String defenderUtilityTypeSkill;
}