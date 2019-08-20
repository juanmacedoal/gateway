package com.gateway.filter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.gateway.filter.RouteZuulFilter;

/**
 * The Class RouteZuulFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class RouteZuulFilterTest {
    
    /** The route zuul filter. */
    @InjectMocks
    RouteZuulFilter routeZuulFilter;
    
    /** The Constant ROUTE. */
    private static final String ROUTE = "route";
    
    /** The Constant ORDER. */
    private static final int ORDER = 1;
    
    /**
     * Run test.
     */
    @Test
    public void runTest(){
        assertEquals(null, routeZuulFilter.run());
    }
    
    /**
     * Should filter test.
     */
    @Test
    public void shouldFilterTest(){
        assertEquals(true, routeZuulFilter.shouldFilter());
    }
    
    /**
     * Filter type test.
     */
    @Test
    public void filterTypeTest(){
        assertEquals(ROUTE, routeZuulFilter.filterType());
    }
    
    /**
     * Filter order test.
     */
    @Test
    public void filterOrderTest(){
        assertEquals(ORDER, routeZuulFilter.filterOrder());
    }
}
