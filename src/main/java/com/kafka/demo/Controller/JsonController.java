package com.kafka.demo.Controller;

import com.kafka.demo.Kafka.JsonKafkaProducer;
import com.kafka.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonController {
    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> userObjectSend(@RequestBody User user){
        jsonKafkaProducer.sendJsonObject(user);
        return ResponseEntity.ok("Object send to topic");
    }
}
