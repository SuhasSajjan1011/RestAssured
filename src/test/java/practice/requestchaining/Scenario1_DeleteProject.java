package practice.requestchaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practice.POJOClassUtility.POJOClassUtility;

public class Scenario1_DeleteProject 
{
	
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		
		POJOClassUtility pobj = new POJOClassUtility("Suhas Sajjan","Vodafone"+ranNum,100,"Created");
		
		Response resp = given()
				.contentType(ContentType.JSON)
				.body(pobj)
				.when()
				.post("http://49.249.28.218:8091/addProject");
				resp.then()
				.assertThat().statusCode(201)
				.log().all();
				
				String projectId = resp.jsonPath().get("projectId");
				System.out.println(projectId);
				
				 when()
				.delete("http://49.249.28.218:8091/project/"+projectId)
				.then()
				.log().all();
				
				
	}
}
