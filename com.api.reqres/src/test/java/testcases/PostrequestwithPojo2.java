package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.authservice;

import RequestPOjo.CreateRequestPojo;
import ResponsePOjo.CreateResponsejava;
import io.restassured.response.Response;


@Listeners(com.api.listeners.TestListeners.class)
public class PostrequestwithPojo2 {

	@Test(description="if Post API is working fine!!")
	public void loginTest()
	{
		CreateRequestPojo createrequestpojo=new CreateRequestPojo("eve.holt@reqres.in","cityslicka");
		authservice auth=new authservice();
		Response response=auth.login(createrequestpojo);
		CreateResponsejava loginresponse=response.as(CreateResponsejava.class); //deserialiaze
		System.out.println(response.asPrettyString());
		
		System.out.println(loginresponse.getToken());
		
	}
	}
