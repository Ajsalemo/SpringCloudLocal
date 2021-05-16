package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    private static final String URL = "http://localhost:7070/name";

    @Autowired
    private RestTemplate rest;

    public String getName() {
        return rest.getForObject(URL, String.class);
    }
}
