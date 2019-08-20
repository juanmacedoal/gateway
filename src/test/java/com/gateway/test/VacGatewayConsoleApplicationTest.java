package com.gateway.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.servlet.DispatcherServlet;

import com.GatewayApplication;
import com.common.logger.LoggerReconfigurator;

/**
 * The Class ApiGatewayApplicationTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class VacGatewayConsoleApplicationTest {
    
    /**
     * Setup the test environment.
     */
    @Before
    public void setUp(){
        ReflectionTestUtils.setField(LoggerReconfigurator.class, "appName", "gateway");
    }
    
    /**
     * Main test throws exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void mainTestThrowsException(){
        
        GatewayApplication.main(null);
    }
    
    /**
     * Main test.
     */
    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void mainTest(){
        
        String[] args = { "1", "2" };
        GatewayApplication.main(args);
        
        GatewayApplication.main(null);
    }
    
    /**
     * Main test.
     */
    @Test
    public void dispatcherServletTest(){
        GatewayApplication app = new GatewayApplication();
        DispatcherServlet ds = app.dispatcherServlet();
        
        Assert.assertNotNull(ds);
    }
    
}
