package com.gateway.configuration.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.gateway.configuration.ZuulConfiguration;
import com.gateway.filter.ErrorZuulFilter;
import com.gateway.filter.PostZuulFilter;
import com.gateway.filter.PreZuulFilter;
import com.gateway.filter.RouteZuulFilter;
import com.gateway.filter.UserSessionZuulFilter;

/**
 * The Class ZuulFiltersConfigurationTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class ZuulFiltersConfigurationTest {
    
    /** The zuul filters configuration. */
    @InjectMocks
    private ZuulConfiguration zuulFiltersConfiguration;
    
    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception{
        
    }
    
    /**
     * Pre zuul filter test.
     */
    @Test
    public void preZuulFilterTest(){
        zuulFiltersConfiguration = new ZuulConfiguration();
        PreZuulFilter preZuulFilter = zuulFiltersConfiguration.preZuulFilter();
        
        Assert.assertNotNull(preZuulFilter);
    }
    
    /**
     * Route zuul filter test.
     */
    @Test
    public void routeZuulFilterTest(){
        zuulFiltersConfiguration = new ZuulConfiguration();
        RouteZuulFilter routeZuulFilter = zuulFiltersConfiguration.routeZuulFilter();
        
        Assert.assertNotNull(routeZuulFilter);
    }
    
    /**
     * Post zuul filter test.
     */
    @Test
    public void postZuulFilterTest(){
        zuulFiltersConfiguration = new ZuulConfiguration();
        PostZuulFilter postZuulFilter = zuulFiltersConfiguration.postZuulFilter();
        
        Assert.assertNotNull(postZuulFilter);
    }
    
    /**
     * Error zuul filter test.
     */
    @Test
    public void errorZuulFilterTest(){
        zuulFiltersConfiguration = new ZuulConfiguration();
        ErrorZuulFilter errorZuulFilter = zuulFiltersConfiguration.errorZuulFilter();
        
        Assert.assertNotNull(errorZuulFilter);
    }
    
    /**
     * User session zuul filter test.
     */
    @Test
    public void userSessionZuulFilterTest(){
        zuulFiltersConfiguration = new ZuulConfiguration();
        UserSessionZuulFilter userSessionZuulFilter = zuulFiltersConfiguration.userSessionZuulFilter();
        
        Assert.assertNotNull(userSessionZuulFilter);
    }
}
