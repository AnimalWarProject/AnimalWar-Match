package com.example.Matching.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private UUID uuid;

    private String id;
    private String nickName;
    private int food;
    private int iron;
    private int wood;
    private int gold;

    private int life;
    private int attackPower;
    private int defensePower;
    private int battlePoint;

    private String profileImage;

    private Species species;


    private String attackerAttackTypeSkill;
    private String attackerDefenseTypeSkill;
    private String attackerUtilityTypeSkill;

    private String defenderAttackTypeSkill;
    private String defenderDefenseTypeSkill;
    private String defenderUtilityTypeSkill;
    public void setAttackerAttackTypeSkill(String attackerAttackTypeSkill) {
        this.attackerAttackTypeSkill = attackerAttackTypeSkill;
    }

    public void setAttackerDefenseTypeSkill(String attackerDefenseTypeSkill) {
        this.attackerDefenseTypeSkill = attackerDefenseTypeSkill;
    }

    public void setAttackerUtilityTypeSkill(String attackerUtilityTypeSkill) {
        this.attackerUtilityTypeSkill = attackerUtilityTypeSkill;
    }

    public void setDefenderAttackTypeSkill(String defenderAttackTypeSkill) {
        this.defenderAttackTypeSkill = defenderAttackTypeSkill;
    }

    public void setDefenderDefenseTypeSkill(String defenderDefenseTypeSkill) {
        this.defenderDefenseTypeSkill = defenderDefenseTypeSkill;
    }

    public void setDefenderUtilityTypeSkill(String defenderUtilityTypeSkill) {
        this.defenderUtilityTypeSkill = defenderUtilityTypeSkill;
    }
}
