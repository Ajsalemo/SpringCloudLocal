package com.greeting.springcloud.Controllers;

import java.util.logging.Logger;

import com.greeting.springcloud.Properties.GreetingProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingProperties greetingProperties;

    private static final Logger LOG = Logger.getLogger(GreetingController.class.getName());

    @GetMapping("/greeting")
    public String greeting() {
        LOG.info("Greeting: " + greetingProperties.getGreeting());
        return greetingProperties.getGreeting();
    }
}
