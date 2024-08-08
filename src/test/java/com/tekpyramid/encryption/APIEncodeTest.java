package com.tekpyramid.encryption;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class APIEncodeTest 
{
	@Test
	public void apiEncodeTest()
	{
		given()
			//.auth().preemptive().basic("rmgyantra","rmgy@9999") if we use preemptive,encrypted text is visible
		// in header which can be easily decrypted using online encodedecode tools.Thats why we go for digestive
			.auth().digest("rmgyantra","rmgy@9999")
			.log().all()
		 .when()
		 	.get("http://49.249.28.218:8091/projects")
		 .then().log().all();
			
	}
}
