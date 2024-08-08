package practice.withbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateTest 
{
	@Test
	public void createDataIntoServer()
	{
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy", "Suhas Sajjan");
		jsonObj.put("projectName","Project_13");
		jsonObj.put("status", "created");
		jsonObj.put("teamSize", 5);
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonObj.toJSONString())
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
	}
}
