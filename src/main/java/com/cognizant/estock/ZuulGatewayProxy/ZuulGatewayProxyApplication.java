package com.cognizant.estock.ZuulGatewayProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulGatewayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayProxyApplication.class, args);
	}

}
