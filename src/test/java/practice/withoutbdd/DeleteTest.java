package practice.withoutbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest 
{
	@Test
	public void sampleTest()
	{
		Response resp = RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_979");
		resp.then().log().all();
		resp.then().assertThat().statusCode(204);
	}
}
