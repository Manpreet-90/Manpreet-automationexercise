package com.api.base;

//improves readability
import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.api.filters.loginfilter;
import io.restassured.specification.RequestSpecification;

public class baseclass { //WRAPPER FOR RESTASSURED
	//BASE URI
	//CFEATING THE REQUEST
	//HANDLE THE RESPONSE
	
	
	private static final String  BASE_URL="https://reqres.in";
	private RequestSpecification requestspecifivcation;  //instance variable
	
	/*static
	{
		RestAssured.filters(new loginfilter());
	}*/
	
	
	
	
	
	

	public baseclass()  //constructor to initialize instance variables
	{
		//requestspecifivcation=RestAssured.given().baseUri(BASE_URL);
		requestspecifivcation=given().baseUri(BASE_URL);
	}

	protected Response PostRequest(Object payload,String endpoint)
	{
		
		return requestspecifivcation.filter(new loginfilter()).contentType(ContentType.JSON).header("x-api-key", "reqres_0e4a62a7f41343458017e3b978503383").body(payload).post(endpoint);
		
	}
}
