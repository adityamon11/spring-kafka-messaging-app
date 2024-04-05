package com.kafkachat.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ChatMessage {

    private String sender;

    private String message;

    private LocalDateTime timestamp;

    public ChatMessage() {
        timestamp = LocalDateTime.now();
    }
}