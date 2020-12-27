package com.arya.onecalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class OneCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneCalcApplication.class, args);
	}
	
	@Autowired
	Environment env;
	
	@Autowired
	OneCalcServiceClient oneCalcServiceClient; 
	
	@GetMapping("/")
	public String info() {
		return "Hello User from "+env.getProperty("server.port")+" and Service from "+oneCalcServiceClient.getInfo();
	}

}
