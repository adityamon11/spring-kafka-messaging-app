package com.kafkachat.controller;

import com.kafkachat.model.ChatMessage;
import com.kafkachat.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/send-message")
    public String sendMessageToKafka(@RequestBody ChatMessage message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }


}
