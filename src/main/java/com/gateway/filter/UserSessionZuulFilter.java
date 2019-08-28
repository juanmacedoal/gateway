package com.gateway.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * Generate Global ID User session HTTP Header Param
 * 
 */
public class UserSessionZuulFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory
			.getLogger(UserSessionZuulFilter.class);

	private static final String X_SESSION_ID = "X-Session-Id";

	/**
	 * Run filter logic.
	 * 
	 * @return {@link Object}
	 */
	@Override
	public Object run() {
		generateSessionId();
		return null;
	}

	/**
	 * Check when to filter.
	 * 
	 * @return boolean
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * Gets the filter type.
	 * 
	 * @return {@link String}
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * Gets the filter order.
	 * 
	 * @return int
	 */
	@Override
	public int filterOrder() {
		return 2;
	}

	/**
	 * Generates the session ID.
	 */
	private void generateSessionId() {

		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		String sessionId = request.getHeader(X_SESSION_ID);
		// if (StringUtils.isBlank(sessionId)) {
		// sessionId = (new Random().nextLong()).;
		// logger.info("Generating sessionId = {} ", new Random().nextLong());
		// }
		ctx.getZuulRequestHeaders().put(X_SESSION_ID, sessionId);
		response.addHeader(X_SESSION_ID, sessionId);
		logger.info("generated X-Session-Id {}. ", sessionId);
	}

}
