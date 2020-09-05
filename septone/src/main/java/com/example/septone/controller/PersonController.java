package com.example.septone.controller;

import com.example.septone.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public Person getPerson() {
        Person person = new Person("brown", "blue", "25", "65cm"); //taco object
        return person;
    }
}