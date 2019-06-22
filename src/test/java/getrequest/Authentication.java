package getrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authentication {
@Test
	public void Validuser() {
		
		int code = RestAssured.given().auth()
		  .preemptive().basic("ToolsQA", "TestPassword")
		  .when()
		  .get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
		  .getStatusCode();
		System.out.println("code is" + code);
	}
}
