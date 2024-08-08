package practice.withoutbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CompleteUpdateTest 
{
	@Test
	public void updateTest()
	{
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy", "Suhas Sajjan");
		jsonObj.put("projectName","Operation SkyIsTheLimit");
		jsonObj.put("teamSize", 10);
		jsonObj.put("status", "created");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonObj.toJSONString());
		
		Response resp = req.put("http://49.249.28.218:8091/project/NH_PROJ_992");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}
}
