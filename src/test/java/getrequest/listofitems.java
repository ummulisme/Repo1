package getrequest;
import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.*;
import org.testng.annotations.Test;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import org.hamcrest.Matchers;

public class listofitems {
@Test
	public void Searchanitemfromalist()
	{

	 
 RestAssured.get("https://reqres.in/api/unknown?page=1").
		then().assertThat().body("page.year",hasItems("2001","2002"));
		
		
}
}