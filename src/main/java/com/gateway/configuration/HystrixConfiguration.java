package com.gateway.configuration;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;

/**
 * Eureka configurations used for services discovery.
 * 
 *
 */
@Configuration
@EnableHystrix
public class HystrixConfiguration {

}
