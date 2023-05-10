package com.connars;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "connarscode",
            groupId = "groupID"
    )
    void listener(String data){
        System.out.println("Listener receeived: " + data + " ;D");
    }
}
