package com.tekpyramid.crudwithbdd;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PartialUpdateTest 
{
	@Test
	public void updateDataIntoServer()
	{
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("createdBy", "Jane Smith");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toString())
		.when()
			.patch("http://49.249.28.218:8091/project/NH_PROJ_683")
		.then()
			.log().all();
	}
}
