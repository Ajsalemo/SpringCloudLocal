package com.greeting.springcloud.Controllers;

import com.greeting.springcloud.Properties.GreetingProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingProperties greetingProperties;

    @GetMapping("/greeting")
    public String greeting() {
        return greetingProperties.getGreeting();
    }
}
