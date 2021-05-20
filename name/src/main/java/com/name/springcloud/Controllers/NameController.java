package com.name.springcloud.Controllers;

import java.util.logging.Logger;

import com.name.springcloud.Properties.NameProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameProperties nameProperties;
    private static final Logger LOG = Logger.getLogger(NameController.class.getName());

    @GetMapping(value = { "/name", "/name/{name}" })
    public String getName(@PathVariable(required = false) String name) {
        if (name != null) {
            return name;
        }

        LOG.info("Name Service: NameController");
        // If name is null then return a default value
        return nameProperties.getName();
    }
}
