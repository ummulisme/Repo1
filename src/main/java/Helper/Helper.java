package Helper;

import static org.testng.Assert.assertEquals;

import io.restassured.response.Response;
import junit.framework.Assert;



public class Helper {

	public static void CheckStatusCode200(Response res)
	
	{
		Assert.assertEquals(200,res.getStatusCode());
	}
}
