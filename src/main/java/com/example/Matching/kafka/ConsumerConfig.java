package com.example.Matching.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@Configuration
@RequiredArgsConstructor
public class ConsumerConfig {

    private final KafkaProperties properties;
    @Bean
    public RecordMessageConverter converter(){
        return new JsonMessageConverter();
    }

//    @Bean
//    public ConsumerFactory<String, UserResponse> consumerFactory
//            (Map<String,Object> props){
////       try (JsonDeserialize<Demo> jsonDeserialize = new JsonDeserialize<>(Demo.class));
//
//
//
//        JsonDeserializer<UserResponse> deserializer = new JsonDeserializer<>(UserResponse.class);
//        deserializer.setRemoveTypeHeaders(false);
//        deserializer.setUseTypeHeaders(true);
//        deserializer.addTrustedPackages("*");
//        return new DefaultKafkaConsumerFactory<>(
//                props, new StringDeserializer(),deserializer
//        );
//
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String,UserResponse> containerFactory(){
//        ConcurrentKafkaListenerContainerFactory<String, UserResponse> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//
//        Map<String,Object> props = new HashMap<>(
//                properties.buildConsumerProperties());
//        factory.setConsumerFactory(consumerFactory(props));
//
//        return factory;
//
//    }

}
