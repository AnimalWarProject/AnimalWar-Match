package com.example.Matching.kafka;

import com.example.Matching.domain.User;
import com.example.Matching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserConsumer {

    private final UserRepository userRepository;


    @KafkaListener(topics = TopicConfig.matchTopic)
    public void listen(User user){

        System.out.println(user.toString());

//        User build = User.builder()
//                .uuid(user.getUuid())
//                .id(user.getId())
//                .nickName(user.getNickName())
//                .food(user.getFood())
//                .iron(user.getIron())
//                .wood(user.getWood())
//                .gold(user.getGold())
//                .attackPower(user.getAttackPower())
//                .defensePower(user.getDefensePower())
//                .battlePoint(user.getBattlePoint())
//                .profileImage(user.getProfileImage())
//                .species(user.getSpecies())
//                .build();


        userRepository.save(user);

        }
}
