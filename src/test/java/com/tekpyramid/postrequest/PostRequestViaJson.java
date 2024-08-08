package com.tekpyramid.postrequest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostRequestViaJson 
{

public class CreateTest 
{
	@Test
	public void createDataIntoServer()
	{
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("createdBy","Suhas Sajjan");
		jsonobj.put("status", "Created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName", "Milaap");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString(jsonobj))
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
		
	}
}
}
