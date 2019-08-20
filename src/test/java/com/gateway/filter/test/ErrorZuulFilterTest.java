package com.gateway.filter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.gateway.filter.ErrorZuulFilter;

/**
 * The Class ErrorZuulFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class ErrorZuulFilterTest {
    
    /** The error zuul filter. */
    @InjectMocks
    ErrorZuulFilter errorZuulFilter;
    
    /** The Constant ERROR. */
    private static final String ERROR = "error";
    
    /** The Constant ORDER. */
    private static final int ORDER = 1;
    
    /**
     * Run test.
     */
    @Test
    public void runTest(){
        assertEquals(null, errorZuulFilter.run());
    }
    
    /**
     * Should filter test.
     */
    @Test
    public void shouldFilterTest(){
        assertEquals(true, errorZuulFilter.shouldFilter());
    }
    
    /**
     * Filter type test.
     */
    @Test
    public void filterTypeTest(){
        assertEquals(ERROR, errorZuulFilter.filterType());
    }
    
    /**
     * Filter order test.
     */
    @Test
    public void filterOrderTest(){
        assertEquals(ORDER, errorZuulFilter.filterOrder());
    }
    
}
