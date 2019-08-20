package com.gateway.filter.test;

import static org.junit.Assert.assertEquals;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.gateway.filter.UserSessionZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * The Class UserSessionZuulFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserSessionZuulFilterTest {
    
    /** The user session zuul filter. */
    @InjectMocks
    private UserSessionZuulFilter userSessionZuulFilter;
    
    @Mock
    private HttpServletRequest httpServletRequest;
    
    private MockHttpServletRequest request;
    
    /** The Constant PRE. */
    private static final String PRE = "pre";
    
    /** The Constant ORDER. */
    private static final int ORDER = 2;
    
    @Before
    public void setTestRequestcontext(){
        RequestContext context = new RequestContext();
        
        request = new MockHttpServletRequest();
        
        context.setRequest(new MockHttpServletRequest());
        context.setResponse(new MockHttpServletResponse());
        context.setResponseGZipped(false);
        
        RequestContext.testSetCurrentContext(context);
    }
    
    /**
     * Run test.
     */
    @Test
    public void runTest(){
        
        assertEquals(null, userSessionZuulFilter.run());
    }
    
    /**
     * Run test.
     */
    @Test
    public void runWithEmptyHeaderTest(){
        RequestContext context = new RequestContext();
        
        request = new MockHttpServletRequest();
        request.addHeader("x-session-id", StringUtils.EMPTY);
        
        context.setRequest(new MockHttpServletRequest());
        context.setResponse(new MockHttpServletResponse());
        context.setResponseGZipped(false);
        
        RequestContext.testSetCurrentContext(context);
        
        assertEquals(null, userSessionZuulFilter.run());
    }
    
    /**
     * Should filter test.
     */
    @Test
    public void shouldFilterTest(){
        assertEquals(true, userSessionZuulFilter.shouldFilter());
    }
    
    /**
     * Filter type test.
     */
    @Test
    public void filterTypeTest(){
        assertEquals(PRE, userSessionZuulFilter.filterType());
    }
    
    /**
     * Filter order test.
     */
    @Test
    public void filterOrderTest(){
        assertEquals(ORDER, userSessionZuulFilter.filterOrder());
    }
}
