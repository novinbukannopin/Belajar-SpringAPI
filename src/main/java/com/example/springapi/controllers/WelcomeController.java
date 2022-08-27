package com.example.springapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Novin on 27/08/2022
 * @project springapi
 */

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String Welcome(){
        return "Welcome to Spring Boot API";
    }
}
