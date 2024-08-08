package practice.requestchaining;

import static io.restassured.RestAssured.given;
import static org.mockito.ArgumentMatchers.contains;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practice.POJOClassUtility.EmployeePOJO;
import practice.POJOClassUtility.POJOClassUtility;

public class Scenario2_AddEmployeeToProject 
{
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		
		POJOClassUtility pobj = new POJOClassUtility("Suhas Sajjan","WorldCup"+ranNum,100,"Created");
		
		Response resp = given()
				.contentType(ContentType.JSON)
				.body(pobj)
				.when()
				.post("http://49.249.28.218:8091/addProject");
				resp.then()
				.assertThat().statusCode(201)
				.log().all();
				
		String projectName = resp.jsonPath().get("projectName");
		System.out.println(projectName);
				
		EmployeePOJO empObj = new EmployeePOJO("Software Engineer","15/07/1998","suhassajjan123@gmail.com","Suhas"+ranNum,10,"1234567890",projectName,"Engineer","user"+ranNum);
		
		Response resp1 = given()
				.contentType(ContentType.JSON)
				.body(empObj)
				.when()
				.post("http://49.249.28.218:8091/employees");
				resp1.then()
				.assertThat().statusCode(201)
				.log().all();
		
	}
}
