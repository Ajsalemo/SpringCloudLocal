package com.name.springcloud.Controllers;

import com.name.springcloud.Properties.NameProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameProperties nameProperties;

    @GetMapping("/name")
    public String getName() {
        return nameProperties.getName();
    }
}
