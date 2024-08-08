package com.tekpyramid.requestchaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import com.tekpyramid.POJOClassUtility.POJOClassUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario1_DeleteProject 
{
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		
		POJOClassUtility pobj = new POJOClassUtility("Airtel"+ranNum,"Created","Suhas Sajjan",10);
		
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(pobj)
	.when()
		.post("http://49.249.28.218:8091/addProject");
	resp.then()
		.assertThat().statusCode(201)
		.log().all();
	
		//capture projectName from the response
		String projectId = resp.jsonPath().get("projectId");
		System.out.println(projectId);
		
		//API-2 delete project
		given()
			.delete("http://49.249.28.218:8091/project/"+projectId)
		.then()
			.log().all();
	
	}
}
