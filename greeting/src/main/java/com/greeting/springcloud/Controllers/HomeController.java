package com.greeting.springcloud.Controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Cloud - Greeting Service";
    private static final Logger LOG = Logger.getLogger(GreetingController.class.getName());

    @GetMapping("/")
    public String home() {
        LOG.info("Greeting: " + message);
        return message;
    }
}
