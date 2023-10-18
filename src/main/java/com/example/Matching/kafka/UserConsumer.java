package com.example.Matching.kafka;

import com.example.Matching.domain.User;
import com.example.Matching.dto.response.UserResponse;
import com.example.Matching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserConsumer {

    private final UserRepository userRepository;


    @KafkaListener(topics = TopicConfig.userTopic)
    public void listen(UserResponse userResponse){
        userRepository.save(User.builder()
                .id(userResponse.getId())
                .nickName(userResponse.getNickName())
                .food(userResponse.getFood())
                .iron(userResponse.getIron())
                .wood(userResponse.getWood())
                .gold(userResponse.getGold())
                .attackPower(userResponse.getAttackPower())
                .defensePower(userResponse.getDefensePower())
                .battlePoint(userResponse.getBattlePoint())
                .profileImage(userResponse.getProfileImage())
                .species(userResponse.getSpecies())
                .build());

    }
}
