package com.bkvava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RunAppServer {

	public static void main(String[] args) {
		SpringApplication.run(RunAppServer.class, args);
	}
	
}
