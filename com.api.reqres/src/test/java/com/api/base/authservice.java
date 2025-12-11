package com.api.base;

import RequestPOjo.CreateRequestPojo;
import RequestPOjo.SignupRequest;
import io.restassured.response.Response;

public class authservice extends baseclass {   //login mudule di sb service method wikl amke here
	
	private static final String BASE_PATH="/api";
	
	
	public Response login(CreateRequestPojo payload)
	{
		return PostRequest(payload,BASE_PATH + "/login");
	}       
	
	//api/custom/products
	
	public Response signup(SignupRequest payload)
	{
		return PostRequest(payload,BASE_PATH + "/users");
	}

	
/*	public Response forgot_password(String emailaddress)
	{
		HashMap<String,String>  payload=new HashMap<String,String>();
		payload.put("email","emailaddress");
		return PostRequest(payload,BASE_PATH + "/forgotpassword");
	}*/
}
