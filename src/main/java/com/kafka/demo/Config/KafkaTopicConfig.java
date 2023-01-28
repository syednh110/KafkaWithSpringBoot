package com.kafka.demo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String jsonTopicName;

    @Bean
    public NewTopic kafkaNewTopic(){
        return TopicBuilder.name(topicName).build();
    }

    @Bean
    public NewTopic kafkaNewJsonTopic(){
        return TopicBuilder.name(jsonTopicName).build();
    }
}
