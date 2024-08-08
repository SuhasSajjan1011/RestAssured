package practice.postrequest;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import practice.POJOClassUtility.POJOClassUtility;

public class POSTRequestViaPOJO 
{
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		POJOClassUtility pobj = new POJOClassUtility("Suhas Sajjan","Operation Sun"+ranNum, 10, "Created");
		
		given()
			.contentType(ContentType.JSON)
			.body(pobj)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
}
}
