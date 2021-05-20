package com.configserver.springcloud.Controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Welcome from Spring Cloud - Config Server";
    private static final Logger LOG = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String home() {
        LOG.info("Config Server: HomeController");
        return message;
    }
}
