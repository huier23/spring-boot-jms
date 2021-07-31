package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
public class ReceiveController {
    // @JmsListener(destination = "test-queue-jms")
    @JmsListener(destination = "jms-test", subscription ="jms",containerFactory = "topicJmsListenerContainerFactory")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        try {
        Thread.sleep(10000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}