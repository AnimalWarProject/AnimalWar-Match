package com.example.Matching.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@Configuration
public class ConsumerConfig {
    @Bean
    public RecordMessageConverter converter(){
        return new JsonMessageConverter();
    }
}
