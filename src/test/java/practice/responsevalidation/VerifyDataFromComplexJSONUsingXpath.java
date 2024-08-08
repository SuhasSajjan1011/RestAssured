package practice.responsevalidation;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class VerifyDataFromComplexJSONUsingXpath 
{
	@Test
	public void verifyDataFromComplexJSON()
	{
		Response resp = given()
				.get("http://49.249.28.218:8091/projects-paginated");
		resp.then().log().all();
		
		List<String> list = JsonPath.read(resp.asString(),".content[*].projectName");
		for(String data : list)
		{
			System.out.println(data);
		}
		System.out.println(list);
		
		List<String> list2 = JsonPath.read(resp.asString(),".content[*].[?(@.projectName=='Moon')].projectId");
		System.out.println(list2);
		String actualId = list2.get(0);
		Assert.assertEquals(actualId, "NH_PROJ_2433");
	}
}
