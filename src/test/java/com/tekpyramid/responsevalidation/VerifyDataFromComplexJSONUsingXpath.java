package com.tekpyramid.responsevalidation;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class VerifyDataFromComplexJSONUsingXpath 
{
	@Test
	public void responseValidation()
	{
		
			Response resp = given()
			    .get("http://49.249.28.218:8091/projects-paginated");
			resp.then().log().all();
			//resp.then()
			//.log().all();
			
		List<String> list =	JsonPath.read(resp.asString(),".content[*].projectName");
		for(String data: list)
		{
			System.out.println(data);
		}
		System.out.println(list);
		
	
		List<String> list1 =	JsonPath.read(resp.asString(),".content[*].[?(@.projectName=='Moon')].projectId");
		System.out.println(list1);
		String actProjectId = list1.get(0);
		Assert.assertEquals(actProjectId, "NH_PROJ_2433");
	}
			
	
}
