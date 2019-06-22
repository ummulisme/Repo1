package getrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class usernotfound {

	@Test
public void usernotfound1()
{
	RestAssured.expect().statusCode(404).
	when().get("https://reqres.in/api/users/23");
}
}
