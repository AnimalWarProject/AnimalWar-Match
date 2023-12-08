package com.example.Matching.controller;

import com.example.Matching.dto.TokenInfo;
import com.example.Matching.dto.request.AttackerSkillChangeRequest;
import com.example.Matching.dto.request.DefenderSkillChangeRequest;
import com.example.Matching.service.JwtService;
import com.example.Matching.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/skill")
public class SkillController {
    private final SkillService skillService;
    private final JwtService jwtService;

    @PutMapping("/changeAttackerSkill")
    public void changeAttackerSkill(@RequestHeader("Authorization") String accessToken,
                                    @RequestBody AttackerSkillChangeRequest request){
        TokenInfo tokenInfo = jwtService.parseAccessToken(accessToken.replace("Bearer " , ""));
        UUID uuId = tokenInfo.getUserUUID();
        skillService.changeAttackerSkill(request, uuId);
    }
    @PutMapping("/changeDefenderSkill")
    public void changeDefenderSkill(@RequestHeader("Authorization") String accessToken,
                                    @RequestBody DefenderSkillChangeRequest request){
        TokenInfo tokenInfo = jwtService.parseAccessToken(accessToken.replace("Bearer " , ""));
        UUID uuid = tokenInfo.getUserUUID();
        skillService.changeDefenderSkill(request, uuid);
    }
}
