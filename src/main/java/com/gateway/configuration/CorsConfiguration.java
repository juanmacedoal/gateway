package com.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/****
 * Application configuration.****
 *
 */
@Configuration
public class CorsConfiguration {

	/**
	 * CORS configuration.
	 */
	@Bean
	public WebFluxConfigurer corsConfigurer() {
		return new WebFluxConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("*").allowCredentials(true)
						.allowedOrigins("*").allowedHeaders("*")
						.allowedMethods("OPTIONS").allowedMethods("HEAD")
						.allowedMethods("GET").allowedMethods("PUT")
						.allowedMethods("POST").allowedMethods("DELETE")
						.allowedMethods("PATCH");
			}
		};
	}

}
