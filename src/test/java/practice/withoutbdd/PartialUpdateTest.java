package practice.withoutbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PartialUpdateTest 
{
	@Test
	public void updateTest()
	{
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("projectName", "BehindTheScenes");
		
		RequestSpecification req = RestAssured.given();
		
		req.contentType(ContentType.JSON);
		req.body(jsonObj.toJSONString());
		
		Response resp = req.patch("http://49.249.28.218:8091/project/NH_PROJ_992");
		
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}
}
