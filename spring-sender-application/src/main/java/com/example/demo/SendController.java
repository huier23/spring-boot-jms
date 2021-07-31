package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
    
    private static final String queue = "test-queue-jms";
    private static final String topic = "jms-test";

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/send")
    public String postMessage(@RequestParam int count) {
    // public String postMessage() {    
        // jmsTemplate.send(queue, s -> s.createTextMessage(message));
        // String msg = new String("akjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfs");
        String msg = "akjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfsdjkjkcmlmsdfsdsdssffakjdfldfs";
        for(int i=1;i<=count;i++){
            // jmsTemplate.send(topic, s -> s.createTextMessage(message));
            jmsTemplate.send(topic, s -> s.createTextMessage(msg));
            System.out.println("Sent <" + i + ">");
            // return message;
        }
        return "sent!";
    }
}