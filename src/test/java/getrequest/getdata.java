package getrequest;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.matcher.RestAssuredMatchers.*;


public class getdata {
@Test
	public void testResponse()
	{
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		int code = resp.getStatusCode();
		System.out.println("code is "+ code);
		Assert.assertEquals(code, 200);
		Assert.assertTrue(resp.getTimeIn(TimeUnit.SECONDS)<10,"Response time is off limit");
		}
@Test
public void testExtractedresponsedata()
{
	Response respbody = RestAssured.get("https://reqres.in/api/users?page=2");
	ResponseBodyData body = respbody.getBody();
	String bodyAsString = body.asString();
	Assert.assertEquals(bodyAsString.contains("Eve"), true,"Response has email");
	
}
}
	

