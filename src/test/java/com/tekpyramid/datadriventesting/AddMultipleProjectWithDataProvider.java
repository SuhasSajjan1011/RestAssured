package com.tekpyramid.datadriventesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddMultipleProjectWithDataProvider 
{
	@Test(dataProvider = "getData")
	public void sampleTest(String pName, String status)
	{
		String reqBody = "{\n"
				+ "  \"createdBy\": \"Suhas\",\n"
				+ "  \"projectName\": \""+pName+"\",\n"
				+ "  \"status\": \""+status+"\",\n"
				+ "  \"teamSize\": 10\n"
				+ "}";
		given()
			.contentType(ContentType.JSON)
			.body(reqBody)
		.when()
			.post("http://49.249.28.218:8091/addProject")
			.then()
				.log().all();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objarr = new Object[3][2];
		objarr[0][0] = "AirWorld";
		objarr[0][1] = "created";
		
		objarr[1][0] = "AirUniverse";
		objarr[1][1] = "created";
		
		objarr[2][0] = "AirGalaxy";
		objarr[2][1] = "created";
		
		return objarr;
	}
	
}
