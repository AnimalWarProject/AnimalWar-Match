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
        userRepository.save(user);

        }
}
