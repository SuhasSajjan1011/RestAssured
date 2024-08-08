package com.tekpyramid.petstore.uploadimage;

import java.io.File;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class uploadImage 
{
	@Test
	public void uploadImageIntoServer()
	{
		File fobj = new File("/Users/suhassajjan/Downloads/cute-animals-group-white-background_23-2150038562.avif");
		
		given()
			.contentType(ContentType.MULTIPART)
			.multiPart(fobj)
		.when()
		.post("https://petstore.swagger.io/v2/pet/9223372036854601899/uploadImage")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
