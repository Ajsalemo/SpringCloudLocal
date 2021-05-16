package com.web.springcloud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Welcome to Spring Cloud - Web Service";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
