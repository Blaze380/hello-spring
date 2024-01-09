package com.blazeland.hellospring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping()
    public ResponseEntity<Message> getHelloWorld() {
        var message = new Message();
        message.setMessage("Olá Mundo!");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}

class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
