package com.tekpyramid.crudwithoutbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest 
{
	@Test
	public void deleteDataFromServer()
	{
		Response resp = RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_449");
		
		resp.then().assertThat().statusCode(204);
		
		resp.then().log().all();
	}
}
