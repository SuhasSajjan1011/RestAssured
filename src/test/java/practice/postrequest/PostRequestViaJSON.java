package practice.postrequest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostRequestViaJSON 
{
	@Test
	public void createDataIntoServer()
	{
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Suhas Sajjan");
		obj.put("projectName", "Operation Comet");
		obj.put("teamSize", 10);
		obj.put("status", "created");
		
		given()
			.contentType(ContentType.JSON)
			.body(obj.toJSONString())
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
	}
}
