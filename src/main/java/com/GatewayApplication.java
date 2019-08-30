package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Light API Gateway.
 * 
 */
@SpringBootApplication
public class GatewayApplication {

	/**
	 * Main Spring boot method
	 * 
	 * @param args
	 *            {@link String}[]
	 */
	public static void main(final String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
