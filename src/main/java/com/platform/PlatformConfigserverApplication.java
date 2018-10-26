package com.platform;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
@RestController
public class PlatformConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformConfigserverApplication.class, args);
	}
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/")
	public String home() {
		return "hello world from port " + port;
	}
}
