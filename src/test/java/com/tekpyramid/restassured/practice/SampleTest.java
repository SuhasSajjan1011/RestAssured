package com.tekpyramid.restassured.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest 
{
	@Test
	public void sampleGetReqTest()
	{
        /*Response is a class in RestAssured to store response*/	
		/*"https://reqres.in/api/users?page=2" is Base URL and end point for one of the reqres request*/
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(resp.prettyPrint());
	}
}
