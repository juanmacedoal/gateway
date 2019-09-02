package com.hystrix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class HystrixController {

	@GetMapping("/config")
	public String firstServiceFallback() {
		return "Cloud Config Service is down.";
	}

	@GetMapping("/microservices")
	public String secondServiceFallback() {
		return "This API is not working.";
	}
}
