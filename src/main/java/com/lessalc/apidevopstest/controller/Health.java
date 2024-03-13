package com.lessalc.apidevopstest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {

    @GetMapping
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("Olá mundo!");
    }
}
