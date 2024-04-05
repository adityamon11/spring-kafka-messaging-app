package com.kafkachat.service;

import com.kafkachat.model.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    @KafkaListener(topics = "chat-messages", groupId = "group-id")
    public void consume(ChatMessage message) {
        // Process the received message
        System.out.println("Received message: " + message);
    }
}
