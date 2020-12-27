package com.arya.onecalcmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnecalcmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnecalcmgmtApplication.class, args);
	}

}
