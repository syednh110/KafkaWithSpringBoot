package com.kafka.demo.Kafka;

import com.kafka.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javatopic_json",groupId = "myGroup")
    public void consume(User data){
        LOGGER.info(String.format("User received %s",data.toString()));
    }
}
