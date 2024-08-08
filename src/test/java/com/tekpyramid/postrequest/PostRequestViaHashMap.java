package com.tekpyramid.postrequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PostRequestViaHashMap 
{
	@Test
	public void createDataIntoServer()
	{
		HashMap<String,Object> map = new HashMap();
		
		map.put("createdBy","Suhas Sajjan");
		map.put("status", "Created");
		map.put("teamSize", 10);
		map.put("projectName", "Project_1");
		
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