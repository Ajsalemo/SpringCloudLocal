package com.web.springcloud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class GreetingService {
    @Autowired
    private GreetingFeignClient greetingFeignClient;

    public String getGreeting() {
        return greetingFeignClient.getGreeting();
    }

    @FeignClient("greeting")
    static interface GreetingFeignClient {
        @RequestMapping("/greeting")
        public String getGreeting();
    }
}
