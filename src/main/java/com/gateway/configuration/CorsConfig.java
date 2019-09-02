package com.gateway.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * Application configuration.****
 *
 */
@Configuration
@EnableWebFlux
public class CorsConfig implements WebFluxConfigurer {

	// @Override
	// public void addCorsMappings(CorsRegistry corsRegistry) {
	// corsRegistry.addMapping("/**")
	// .allowedOrigins("http://allowed-origin.com")
	// .allowedMethods("PUT").maxAge(3600);
	// }
	//
	// @Bean
	// CorsWebFilter corsWebFilter() {
	// CorsConfiguration corsConfig = new CorsConfiguration();
	// corsConfig
	// .setAllowedOrigins(Arrays.asList("https://allowed-origin.com"));
	// corsConfig.setMaxAge(8000L);
	// corsConfig.addAllowedMethod("PUT");
	// corsConfig.addAllowedHeader("Baeldung-Allowed");
	//
	// UrlBasedCorsConfigurationSource source = new
	// UrlBasedCorsConfigurationSource();
	// source.registerCorsConfiguration("/**", corsConfig);
	//
	// return new CorsWebFilter(source);
	// }
}
