package com.configserver.springcloud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Welcome from Spring Cloud - Config Server";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
