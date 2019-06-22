package getrequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
@Test
public class postexampletwo {
	
	String APIurl  = "https://reqres.in/api/users";
	private static String  payload = "{\"name\": \"morpheus\",\"job\":\"leader\"}";

	public  void post()
	{
Response r = given().contentType("application/json").
		body(payload)
		.post(APIurl)
		.then()
		.statusCode(201);
		
	JSONObject jsonbody = new JSONObject(r.body().asString());
		
	}
}
