package TestBase;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

public class TestBase {
	
	public static void VerifytheHeader()
	{
		
	RequestSpecBuilder builder = new RequestSpecBuilder();
	builder.setContentType("applicationType/Json");
	System.out.println("Verified the header");
	
    }
	
	public static void SetURI(String baseURI)
	{
		RestAssured.baseURI = baseURI;
		
	}

}

