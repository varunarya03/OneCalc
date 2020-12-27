package com.arya.onecalc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "onecalc-service")
public interface OneCalcServiceClient {
	
	@GetMapping(value = "/")
	String getInfo();

}
