package practice.withbdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ReadTest 
{
	@Test
	public void readDataFromServer()
	{
		given()
		.when()
		.get("http://49.249.28.218:8091/projects")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
