package com.example.Matching.service;

import com.example.Matching.domain.User;
import com.example.Matching.dto.request.AttackerSkillChangeRequest;
import com.example.Matching.dto.request.DefenderSkillChangeRequest;
import com.example.Matching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final UserRepository userRepository;

    @Transactional
    public void changeAttackerSkill(AttackerSkillChangeRequest request, UUID userId) {
        Optional<User> optionalUser = userRepository.findByUuid(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setAttackerAttackTypeSkill(request.getAttackerAttackTypeSkill());
            user.setAttackerDefenseTypeSkill(request.getAttackerDefensiveTypeSkill());
            user.setAttackerUtilityTypeSkill(request.getAttackerUtilityTypeSkill());
        } else {
            throw new RuntimeException("User not found with UUID: " + userId);
        }
    }

    @Transactional
    public void changeDefenderSkill(DefenderSkillChangeRequest request , UUID userId) {
        Optional<User> optionalUser = userRepository.findByUuid(userId);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setDefenderAttackTypeSkill(request.getDefenderAttackTypeSkill());
            user.setDefenderDefenseTypeSkill(request.getDefenderDefensiveTypeSkill());
            user.setDefenderUtilityTypeSkill(request.getDefenderUtilityTypeSkill());
        } else {
            throw new RuntimeException("User not found with UUID: " + userId);
        }
    }
}
