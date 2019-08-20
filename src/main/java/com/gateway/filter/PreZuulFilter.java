package com.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * Executes routing previous actions.
 * 
 */
public class PreZuulFilter extends ZuulFilter {
    
    private static Logger logger = LoggerFactory.getLogger(PreZuulFilter.class);
    
    /**
     * Run filter logic.
     * 
     * @return {@link Object}
     */
    @Override
    public Object run(){
        
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        
        logger.info("{} request to {}", request.getMethod(), request.getRequestURI());
        
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
        return "pre";
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
