package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    @Autowired
    private RestTemplate rest;

    public String urlBuilder(String name) {
        return "http://localhost:7070/name/" + name;
    }

    public String getName(String name) {
        return rest.getForObject(urlBuilder(name), String.class);
    }
}
