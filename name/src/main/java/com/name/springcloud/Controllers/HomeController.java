package com.name.springcloud.Controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Boot - Name service";
    private static final Logger LOG = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String home() {
        LOG.info("Name Service: HomeController");
        return message;
    }
}

