package practice.postrequest;

import java.io.File;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PostRequestViaJSONFile 
{
	@Test
	public void createDataIntoServer()
	{
		File obj = new File("./JSONFile.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
