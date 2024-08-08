package com.tekpyramid.postrequest;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import com.tekpyramid.POJOClassUtility.POJOClassUtility;

import io.restassured.http.ContentType;

public class PostRequestViaPOJO 
{
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		POJOClassUtility pobj = new POJOClassUtility("Project_10"+ranNum,"Created","Suhas Sajjan",10);
		
		given()
		.contentType(ContentType.JSON)
		.body(pobj)
	.when()
		.post("http://49.249.28.218:8091/addProject")
	.then()
		.assertThat().statusCode(201)
		.log().all();
	
	}
}
