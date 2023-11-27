package com.beaconfire.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/health")
@RestController
public class SystemController {
    @GetMapping
    public ResponseEntity health() {
        return ResponseEntity.ok("hello world!");
    }


}
