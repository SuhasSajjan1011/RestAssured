package practice.responsevalidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class VerifyResponseHeader 
{
	@Test
	public void verifyResponse()
	{
		Response resp = given()
				.get("http://49.249.28.218:8091/projects");
		resp.then().log().all();
		
		resp.then().contentType(ContentType.JSON);
		
		resp.then().assertThat().statusLine("HTTP/1.1 200 ");
		
		resp.then().assertThat().header("Transfer-Encoding","chunked");
	}
}
