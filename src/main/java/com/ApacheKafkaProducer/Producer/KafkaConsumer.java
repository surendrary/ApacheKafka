package com.ApacheKafkaProducer.Producer;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "NewTopic1", groupId = "group_id")
    public void consume(String Msg){
        System.out.println("Message is = "+ Msg);
    }
}
