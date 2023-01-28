package com.kafka.demo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaNewTopic(){
        return TopicBuilder.name("javatopic").build();
    }

    @Bean
    public NewTopic kafkaNewJsonTopic(){
        return TopicBuilder.name("javatopic_json").build();
    }
}
