package com.gateway.filter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.gateway.filter.PostZuulFilter;

/**
 * The Class PostZuulFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PostZuulFilterTest {
    
    /** The post zuul filter. */
    @InjectMocks
    PostZuulFilter postZuulFilter;
    
    /** The Constant POST. */
    private static final String POST = "post";
    
    /** The Constant ORDER. */
    private static final int ORDER = 1;
    
    /**
     * Run test.
     */
    @Test
    public void runTest(){
        assertEquals(null, postZuulFilter.run());
    }
    
    /**
     * Should filter test.
     */
    @Test
    public void shouldFilterTest(){
        assertEquals(true, postZuulFilter.shouldFilter());
    }
    
    /**
     * Filter type test.
     */
    @Test
    public void filterTypeTest(){
        assertEquals(POST, postZuulFilter.filterType());
    }
    
    /**
     * Filter order test.
     */
    @Test
    public void filterOrderTest(){
        assertEquals(ORDER, postZuulFilter.filterOrder());
    }
}
