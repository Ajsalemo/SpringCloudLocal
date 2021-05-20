package com.web.springcloud.Controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Welcome to Spring Cloud - Web Service";
    private static final Logger LOG = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String home() {
        LOG.info("Web Service: HomeController");
        return message;
    }
}
