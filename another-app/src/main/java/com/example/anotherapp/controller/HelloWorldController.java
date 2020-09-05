package com.example.anotherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    //when we call an API we use an endpoint and receive information
    //service layer handles the logic of grabbing and returning information
    //database -> repository layer -> service layer -> controller -> client
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/sub")
    public String anotherEndPoint(){
        return "This is another endpoint";
    }
}
