package getrequest;

import org.testng.annotations.Test;

import Helper.Helper;
import TestBase.TestBase;
import io.restassured.response.Response;


@Test
public class TestusingFramework {
	
	private Response res = null;

	public void setup() {
		TestBase.SetURI("https://reqres.in/api/users?page=2");
	TestBase.VerifytheHeader();
	}
	
	public void Statuscode() {
		Helper.CheckStatusCode200(res);
	}
}
