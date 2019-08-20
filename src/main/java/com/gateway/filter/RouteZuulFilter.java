package com.gateway.filter;

import com.netflix.zuul.ZuulFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * Routing actions
 * 
 */
@Slf4j
public class RouteZuulFilter extends ZuulFilter {
    
    /**
     * Run filter logic.
     * 
     * @return {@link Object}
     */
    @Override
    public Object run(){
        log.debug("The gateway is routing the request...");
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
        return "route";
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
