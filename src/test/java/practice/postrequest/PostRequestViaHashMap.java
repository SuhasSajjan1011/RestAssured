package practice.postrequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostRequestViaHashMap 
{
	@Test
	public void createDataIntoServer()
	{
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("createdBy", "Suhas Sajjan");
		map.put("projectName", "Operation Moon");
		map.put("teamSize", 10);
		map.put("status", "Created");
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
		
	}
}
