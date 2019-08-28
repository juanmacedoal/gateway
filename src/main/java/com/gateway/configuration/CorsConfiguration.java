package com.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
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
