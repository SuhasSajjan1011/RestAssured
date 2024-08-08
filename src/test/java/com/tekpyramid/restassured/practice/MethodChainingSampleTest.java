package com.tekpyramid.restassured.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured; /* without using static import */
import static io.restassured.RestAssured.*; /* with using static import since we are aware that all methods in RestAssured Class are static */

public class MethodChainingSampleTest 
{
	@Test
	public void getRequestTest()
	{
		RestAssured.get("https://reqres.in/api/users?page=2").prettyPrint(); /* without using static import */
		
		get("https://reqres.in/api/users?page=2").then().log().all(); /*with using static import */
		//Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		//System.out.println(resp.prettyPrint());
	}
}
