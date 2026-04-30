package testcases;

//if i i use static no need to write resta ssured improves readability
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;


@Listeners(com.api.listeners.TestListeners.class)


public class PostrequestwithPojo {

	@Test(description="if Post API is working fine!!")
	public void Postrequest()
	{
		
	
	// RestAssured.baseURI = "https://reqres.in";
    // RestAssured.basePath = "/api";
     baseURI = "https://reqres.in";
     basePath = "/api";
	//Response response=RestAssured.given().header("Content-Type","application/json").header("x-api-key","reqres_0e4a62a7f41343458017e3b978503383").body("{ \"email\": \"eve.holt@reqres.in\",\"password\": \"cityslicka\" }").post("/login");
	
     Response response=given().baseUri("https://9huyy")   //hardcoding not good
    		 .header("Content-Type","application/json").header("x-api-key","reqres_0e4a62a7f41343458017e3b978503383")
    		 .body("{ \"email\": \"eve.holt@reqres.in\",\"password\": \"cityslicka\" }")
    		 .post("/login");
 	
     System.out.println(response.getStatusCode());
	System.out.println(response.asPrettyString());

	Assert.assertEquals(response.getStatusCode(), 200);

	}
}
