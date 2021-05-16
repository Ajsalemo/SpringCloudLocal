package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    private static final String URL = "http://localhost:9090";

    @Autowired
    private RestTemplate rest;

    public String getGreeting() {
        return rest.getForObject(URL, String.class);
    }

    public String getGreeting(String locale) {
        return rest.getForObject(new StringBuilder().append(URL).append("/").append(locale).toString(), String.class);
    }
}
