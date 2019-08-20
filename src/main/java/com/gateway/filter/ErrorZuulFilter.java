package com.gateway.filter;

import com.netflix.zuul.ZuulFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * Error Zuul filter.
 * 
 */
@Slf4j
public class ErrorZuulFilter extends ZuulFilter {
    
    /**
     * Run filter logic.
     * 
     * @return {@link Object}
     */
    @Override
    public Object run(){
        log.debug("handling an error");
        return null;
    }
    
    /**
     * Check when to filter.
     * 
     * @return boolean
     */
    @Override
    public boolean shouldFilter(){
        return true;
    }
    
    /**
     * Gets the filter type.
     * 
     * @return {@link String}
     */
    @Override
    public String filterType(){
        return "error";
    }
    
    /**
     * Gets the filter order.
     * 
     * @return int
     */
    @Override
    public int filterOrder(){
        return 1;
    }
    
}
