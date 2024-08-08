package com.tekpyramid.typesofparameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ParamParameter 
{
	@Test
	public void sampleTest()
	{
		given()
			.param("teamSize", 10)
			.log().all()
		.when()
			.get("http://49.249.28.218:8091/project") //along with get,param parameter acts like a query parameter
			//.post("http://49.249.28.218:8091/project")// along with post,param parameter acts like a form parameter
		.then()
		.log().all();
		
	}
}
