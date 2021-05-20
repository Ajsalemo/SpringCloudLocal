package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    // "greeting" is the name of the service that is being called
    // This equates to localhost:9090 (at the moment) - Ribbon intercepts this and checks the service name against its currently running URL
    // This is help made possible by service discovery
    private static final String URL = "http://greeting/greeting";

    @Autowired
    private RestTemplate rest;

    public String getGreeting() {
        return rest.getForObject(URL, String.class);
    }
}
