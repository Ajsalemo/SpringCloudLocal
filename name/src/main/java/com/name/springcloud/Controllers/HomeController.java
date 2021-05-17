package com.name.springcloud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Boot - Name service";

    @GetMapping("/")
    public String home() {
        return message;
    }
}

