package com.gateway.filter;

import com.netflix.zuul.ZuulFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * Post actions Zuul filter.
 * 
 * @author Vector ITC Group
 */
@Slf4j
public class PostZuulFilter extends ZuulFilter {
    
    /**
     * Run filter logic.
     * 
     * @return {@link Object}
     */
    @Override
    public Object run(){
        log.debug("Execute post call actions");
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
        return "post";
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
