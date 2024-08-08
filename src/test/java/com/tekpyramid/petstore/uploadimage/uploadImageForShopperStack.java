package com.tekpyramid.petstore.uploadimage;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class uploadImageForShopperStack 
{
	@Test
	public void uploadImageIntoServer()
	{
		File fobj = new File("/Users/suhassajjan/Downloads/beautiful-scenery-summit-mount-everest-covered-with-snow-white-clouds_optimized_5.jpg");
		
		given()
			.contentType(ContentType.MULTIPART)
			.multiPart(fobj)
			.queryParam("shopperId", 44674)
		.when()
		
		.post("https://www.shoppersstack.com/shopping/shoppers/upload")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
