package com.gateway.configuration;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gateway.filter.ErrorZuulFilter;
import com.gateway.filter.PostZuulFilter;
import com.gateway.filter.PreZuulFilter;
import com.gateway.filter.RouteZuulFilter;
import com.gateway.filter.UserSessionZuulFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * Zuul Configuration
 * 
 *
 */
@Slf4j
@Configuration
@EnableZuulProxy
public class ZuulConfiguration {
    
    /**
     * Base filter for routing previous actions
     * 
     * @return {@link PreZuulFilter}
     */
    @Bean
    public PreZuulFilter preZuulFilter(){
        
        log.debug("PreZuulFilter enabled.");
        
        return new PreZuulFilter();
    }
    
    /**
     * Base filter for routing actions
     * 
     * @return {@link RouteZuulFilter}
     */
    @Bean
    public RouteZuulFilter routeZuulFilter(){
        
        log.debug("RouteZuulFilter enabled.");
        
        return new RouteZuulFilter();
    }
    
    /**
     * Base filter for post routing actions
     * 
     * @return {@link PostZuulFilter}
     */
    @Bean
    public PostZuulFilter postZuulFilter(){
        
        log.debug("PostZuulFilter enabled.");
        
        return new PostZuulFilter();
    }
    
    /**
     * Base error handling filter
     * 
     * @return {@link ErrorZuulFilter}
     */
    @Bean
    public ErrorZuulFilter errorZuulFilter(){
        
        log.debug("ErrorZuulFilter enabled.");
        
        return new ErrorZuulFilter();
    }
    
    /**
     * Custom filter for users session centralized registration.
     * 
     * @return {@link UserSessionZuulFilter}
     */
    @Bean
    public UserSessionZuulFilter userSessionZuulFilter(){
        
        log.debug("UserSessionZuulFilter enabled.");
        
        return new UserSessionZuulFilter();
    }
}
