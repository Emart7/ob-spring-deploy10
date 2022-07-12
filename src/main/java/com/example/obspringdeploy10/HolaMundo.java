package com.example.obspringdeploy10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    
    @Value("${app.message}")
    String message;

    @GetMapping("/holaMundo")
    public String helloWorld() {
        System.out.println(message);
        return "Hola Mundo";
    }
}
