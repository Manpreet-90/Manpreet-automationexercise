package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.api.listeners.TestListeners;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class loginfilter implements Filter{  //press alt*shift+s+v to see relavant methods

	private static final Logger logger=LogManager.getLogger(loginfilter.class); 
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		logRequest(requestSpec);
		Response response=ctx.next(requestSpec, responseSpec); //intermediator catch things in between and return response
		logResponse(response);
		
		return response;
	}
      
	public void logRequest(FilterableRequestSpecification requestSpec)
	{
		logger.info("BASE_URI" +requestSpec.getBaseUri());
		logger.info("Header" +requestSpec.getHeaders());
		logger.info("Payload" +requestSpec.getBody());
	}
	
	public void logResponse(Response response)
	{
		logger.info("BASE_URI" +response.getStatusCode());
		logger.info("Header" +response.headers());
		logger.info("Payload" +response.getBody().prettyPrint());
	}
}
