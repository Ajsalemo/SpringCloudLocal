package com.greeting.springcloud;

import com.greeting.springcloud.Properties.GreetingProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
@EnableDiscoveryClient
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}

	// Zipkin/Brave sampling
	// @Bean
	// public Sampler getSampler() {
	// 	return new AlwaysSampler();
	// }

}
