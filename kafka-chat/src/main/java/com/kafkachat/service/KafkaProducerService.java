package com.kafkachat.service;

import com.kafkachat.model.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate kafkaTemplate;

    public void sendMessage(ChatMessage message) {
        kafkaTemplate.send("chat-messages", message);
    }
}
