package practice.withoutbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadTest 
{
	@Test
	public void readDataFromServer()
	{
		Response resp = RestAssured.get("http://49.249.28.218:8091/projects");
		
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}
}
