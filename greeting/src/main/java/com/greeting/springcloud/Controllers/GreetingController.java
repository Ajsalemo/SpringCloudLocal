package com.greeting.springcloud.Controllers;

import com.greeting.springcloud.Properties.GreetingProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingProperties greetingProperties;

    @GetMapping("/language/{languageCode}")
    public String home(@PathVariable String languageCode) {
        return greetingProperties.getGreetings().getOrDefault(languageCode.toUpperCase(),
                greetingProperties.getGreeting());
    }
}
