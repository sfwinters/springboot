package com.example.septone.controller;

import com.example.septone.model.Tacos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/taco")
public class TacoController {
    @GetMapping
    public Tacos getTaco() {
        Tacos taco = new Tacos("steak", "hot", "hard shell"); //taco object
        return taco;
    }

    @GetMapping("/listall")
        public Iterable<Tacos> listTacos(){
            List tacos = new ArrayList<Tacos>();
            tacos.add(new Tacos("steak", "spicy", "soft shell"));
            tacos.add(new Tacos("carnitas", "medium", "soft shell"));
            tacos.add(new Tacos("chicken", "mild", "hard shell"));

            return tacos;
        }
}
