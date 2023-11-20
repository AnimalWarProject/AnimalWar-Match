package com.example.Matching.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AttackerSkillChangeRequest {
    private String attackerAttackTypeSkill;
    private String attackerDefensiveTypeSkill;
    private String attackerUtilityTypeSkill;
}