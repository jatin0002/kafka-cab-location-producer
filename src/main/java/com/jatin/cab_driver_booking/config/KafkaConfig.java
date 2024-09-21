package com.jatin.cab_driver_booking.config;

import com.jatin.cab_driver_booking.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstants.CAB_LOCATION)
                .build();
    }
}

