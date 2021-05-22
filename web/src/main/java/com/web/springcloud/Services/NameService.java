package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@EnableFeignClients
public class NameService {
    @Autowired
    private NameFeignClient nameFeignClient;

    public String getName(String name) {
        return nameFeignClient.getName(name);
    }

    @FeignClient("name")
    static interface NameFeignClient {
        @RequestMapping("/name/{name}")
        public String getName(@PathVariable(value = "name") String name);
    }
}
