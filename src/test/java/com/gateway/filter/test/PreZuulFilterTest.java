package com.gateway.filter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.gateway.filter.PreZuulFilter;

/**
 * The Class PreZuulFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PreZuulFilterTest {
    
    /** The pre zuul filter. */
    @InjectMocks
    PreZuulFilter preZuulFilter;
    
    /** The Constant PRE. */
    private static final String PRE = "pre";
    
    /** The Constant ORDER. */
    private static final int ORDER = 1;
    
    /**
     * Run test.
     */
    @Test
    public void runTest(){
        assertEquals(null, preZuulFilter.run());
    }
    
    /**
     * Should filter test.
     */
    @Test
    public void shouldFilterTest(){
        assertEquals(true, preZuulFilter.shouldFilter());
    }
    
    /**
     * Filter type test.
     */
    @Test
    public void filterTypeTest(){
        assertEquals(PRE, preZuulFilter.filterType());
    }
    
    /**
     * Filter order test.
     */
    @Test
    public void filterOrderTest(){
        assertEquals(ORDER, preZuulFilter.filterOrder());
    }
}
