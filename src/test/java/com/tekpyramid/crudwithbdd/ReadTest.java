package com.tekpyramid.crudwithbdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;

public class ReadTest 
{
	@Test
	public void getDataFromServer()
	{
		
		given()
			.get("http://49.249.28.218:8091/projects")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
