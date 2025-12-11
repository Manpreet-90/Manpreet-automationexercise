package testcases;

import org.testng.annotations.Listeners;


import org.testng.annotations.Test;

import com.api.base.authservice;

import RequestPOjo.SignupRequest;
import io.restassured.response.Response;


//put listener annotaion in top of class alwyasy


public class AccuntrCreaion {
	
	@Test(description="if Post API for signup is working fine!!")
	public void signup()
	{

		SignupRequest signuprequest=new SignupRequest.Builder()
				.Name("Iphone 14")
				.job("Leader")
				
				.Build();              //closing builder sysntax
		authservice auth=new authservice();
		Response response=auth.signup(signuprequest);
		//CreateResponsejava loginresponse=response.as(CreateResponsejava.class); //deserialiaze
		System.out.println(response.asPrettyString());
		
	//	System.out.println(loginresponse.getToken());
		
		
	}

}
