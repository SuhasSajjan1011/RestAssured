package practice.withbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PartialUpdateTest 
{
	@Test
	public void updateTest()
	{
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("projectName", "Project Twicupple");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonObj.toJSONString())
		.when()
			.patch("http://49.249.28.218:8091/project/NH_PROJ_976")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
