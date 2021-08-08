package com.kingsley.servicediscoveryone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicediscoveryoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicediscoveryoneApplication.class, args);
	}

}
