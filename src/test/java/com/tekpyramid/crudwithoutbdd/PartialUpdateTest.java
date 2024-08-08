package com.tekpyramid.crudwithoutbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PartialUpdateTest 
{
	@Test
	public void updateDataIntoServer()
	{
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("projectName", "Happy_Faces");
		
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response res = req.patch("http://49.249.28.218:8091/project/NH_PROJ_449");
		res.then().log().all();
		res.then().assertThat().statusCode(200);
	}
}
