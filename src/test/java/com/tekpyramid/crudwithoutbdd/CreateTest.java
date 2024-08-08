package com.tekpyramid.crudwithoutbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateTest 
{
	@Test
	public void createDataIntoServer()
	{
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("createdBy","Suhas Sajjan");
		jsonobj.put("status", "Created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName", "Project100");
		
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response res = req.post("http://49.249.28.218:8091/addProject");
		res.then().log().all();
		res.then().assertThat().statusCode(201);
	}
}
