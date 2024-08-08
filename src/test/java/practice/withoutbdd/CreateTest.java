package practice.withoutbdd;

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
		
		jsonobj.put("createdBy", "Suhas Sajjan");
		jsonobj.put("projectName", "Project Star");
		jsonobj.put("teamSize", 100);
		jsonobj.put("status", "created");
		
		RequestSpecification req = RestAssured.given();
		
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response resp = req.post("http://49.249.28.218:8091/addProject");
		
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		
	}
}
