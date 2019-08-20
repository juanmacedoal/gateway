package com.gateway.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

/**
 * FallbackProvider Hystrix
 * 
 */
public class HystrixFallBackProvider implements ZuulFallbackProvider
{
    
    private String responseBody = "{\" Gateway unable to reach service request. Please try after sometime\"}";
    private HttpHeaders headers = null;
    private String route = null;
    private int rawStatusCode = 503;
    private HttpStatus statusCode = HttpStatus.SERVICE_UNAVAILABLE;
    private String statusText = "Service Unavailable";
    
    /**
     * 
     * @return
     */
    public String getStatusText()
    {
	return statusText;
    }
    
    /**
     * 
     * @param statusText
     */
    public void setStatusText(String statusText)
    {
	this.statusText = statusText;
    }
    
    /**
     * 
     * HttpHeaders
     * 
     * @return
     */
    public HttpHeaders getHeaders()
    {
	return headers;
    }
    
    /**
     * 
     * int
     * 
     * @return
     */
    public int getRawStatusCode()
    {
	return rawStatusCode;
    }
    
    /**
     * 
     * HttpStatus
     * 
     * @return
     */
    public HttpStatus getStatusCode()
    {
	return statusCode;
    }
    
    /**
     * 
     * void
     * 
     * @param rawStatusCode
     */
    public void setRawStatusCode(int rawStatusCode)
    {
	this.rawStatusCode = rawStatusCode;
    }
    
    /**
     * 
     * void
     * 
     * @param statusCode
     */
    public void setStatusCode(HttpStatus statusCode)
    {
	this.statusCode = statusCode;
    }
    
    /**
     * void
     * 
     * @param headers
     */
    public void setHeaders(HttpHeaders headers)
    {
	this.headers = headers;
    }
    
    /**
     * void
     * 
     * @param route
     */
    public void setRoute(String route)
    {
	this.route = route;
    }
    
    /**
     * String
     * 
     * @return
     */
    public String getResponseBody()
    {
	return responseBody;
    }
    
    /**
     * void
     * 
     * @param responseBody
     */
    public void setResponseBody(String responseBody)
    {
	this.responseBody = responseBody;
    }
    
    /**
     * @return
     */
    @Override
    public ClientHttpResponse fallbackResponse()
    {
	return new ClientHttpResponse()
	{
	    
	    @Override
	    public InputStream getBody() throws IOException
	    {
		if (responseBody == null)
		    responseBody = "{\"message\":\"Service Unavailable. Please try after sometime\"}";
		return new ByteArrayInputStream(responseBody.getBytes());
	    }
	    
	    @Override
	    public HttpHeaders getHeaders()
	    {
		if (headers == null)
		{
		    headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON);
		}
		return headers;
	    }
	    
	    @Override
	    public void close()
	    {
	    
	    }
	    
	    @Override
	    public int getRawStatusCode() throws IOException
	    {
		return rawStatusCode;
	    }
	    
	    @Override
	    public HttpStatus getStatusCode() throws IOException
	    {
		if (statusCode == null)
		    statusCode = HttpStatus.SERVICE_UNAVAILABLE;
		return statusCode;
	    }
	    
	    @Override
	    public String getStatusText() throws IOException
	    {
		if (statusText == null)
		    statusText = "Service Unavailable";
		return statusText;
	    }
	    
	};
    }
    
    /**
     * @return
     */
    @Override
    public String getRoute()
    {
	if (route == null)
	    route = "*";
	return route;
    }
    
}
