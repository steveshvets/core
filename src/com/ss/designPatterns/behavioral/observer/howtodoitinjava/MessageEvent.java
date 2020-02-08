package com.ss.designPatterns.behavioral.observer.howtodoitinjava;
/*
immutable object so that no class can modify it’s content by mistake.
 */
public class MessageEvent {
    final String messageContent;

    public MessageEvent(String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
