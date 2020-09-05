package com.example.anotherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sarahwinters")

public class NameController {
    @GetMapping
    public String sarahwinters() {
        return "Handrew Jobert";
    }
}
