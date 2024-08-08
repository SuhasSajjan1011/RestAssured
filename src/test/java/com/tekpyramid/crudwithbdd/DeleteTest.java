package com.tekpyramid.crudwithbdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;

public class DeleteTest 
{
	@Test
	public void deleteDataFromServer()
	{
		given()
			.delete("http://49.249.28.218:8091/project/NH_PROJ_683")
		.then()
		  .assertThat().statusCode(204)
		 .log().all();
		
	}
}
