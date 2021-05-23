package com.web.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableZuulProxy
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}

	@Configuration
	static class MyConfig {
		@Bean
		@LoadBalanced
		public RestTemplate rest() {
			return new RestTemplateBuilder().build();
		}
	}
}
