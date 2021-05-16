package com.greeting.springcloud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Cloud";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
