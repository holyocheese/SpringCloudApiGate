package com.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.tuji.filter.UserLoginFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
	
	@Bean
	public UserLoginFilter userLoginFilter() {
		return new UserLoginFilter();
	}
}
