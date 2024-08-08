package practice.withbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class CompleteUpdateTest 
{
	@Test
	public void updateTest()
	{
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy", "Suhas Sajjan");
		jsonObj.put("projectName", "Operation Milkyway");
		jsonObj.put("teamSize", 5);
		jsonObj.put("status", "created");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonObj.toJSONString())
		.when()
			.put("http://49.249.28.218:8091/project/NH_PROJ_976")
		.then()
			.assertThat().statusCode(200)
			.log().all();
		  
		
		
	}
}
