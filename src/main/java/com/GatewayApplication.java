package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.DispatcherServlet;

import com.gateway.filter.HystrixFallBackProvider;

/**
 * Light API Gateway NETFLIX Zuul based.
 * 
 */
@SpringBootApplication
public class GatewayApplication
{
    
    /**
     * Main Spring boot method
     * 
     * @param args {@link String}[]
     */
    public static void main(final String[] args)
    {
	SpringApplication.run(GatewayApplication.class, args);
    }
    
    /**
     * Customizing displatcher servlet.
     *
     * @return {@link DispatcherServlet}
     */
    @Bean
    public DispatcherServlet dispatcherServlet()
    {
	
	DispatcherServlet ds = new DispatcherServlet();
	ds.setThrowExceptionIfNoHandlerFound(true);
	
	return ds;
    }
    
    /**
     * HystrixFallback
     * 
     * @return
     */
    @Bean
    @Profile("dev")
    public ZuulFallbackProvider route1ZuulFallbackProvider()
    {
	HystrixFallBackProvider routesZuulFallback = new HystrixFallBackProvider();
	routesZuulFallback.setRoute("*");
	return routesZuulFallback;
    }
    
}
