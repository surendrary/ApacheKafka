package com.ApacheKafkaProducer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public static final String TOPIC = "NewTopic1";

    @GetMapping ("/publish/{msg}")
            public String publishMessage(@PathVariable String msg){
        kafkaTemplate.send(TOPIC,msg);
        return "Published Successfully";
    }
}
