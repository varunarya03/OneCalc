package com.arya.onecalcservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnecalcserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnecalcserviceApplication.class, args);
	}
	
	@Autowired
	Environment env;
	
	@GetMapping("/")
	public String info() {
		return "Service from "+env.getProperty("server.port");
	}

}
