package com.javatechie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    public ResponseEntity<String> orderFallback(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("we are facing a problem in order-service!, Please contact help desk.");
    }
}
