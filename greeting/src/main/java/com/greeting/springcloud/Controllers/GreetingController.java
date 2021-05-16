package com.greeting.springcloud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    String message = "Hello ";

    @GetMapping("/greeting/{name}")
    public String home(@PathVariable String name) {
        return message + name;
    }
}
