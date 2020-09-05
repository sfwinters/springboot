package com.example.septone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saystuff")

public class SayStuffController {
    @GetMapping
    public String sayStuffController() {
            return "This is a string";
        }
}
