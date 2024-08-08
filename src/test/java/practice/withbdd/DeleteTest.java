package practice.withbdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteTest 
{
	@Test
	public void sampleTest()
	{
		given()
		.when()
			.delete("http://49.249.28.218:8091/project/NH_PROJ_976")
		.then()
			.assertThat().statusCode(204)
			.log().all();
	}
}
