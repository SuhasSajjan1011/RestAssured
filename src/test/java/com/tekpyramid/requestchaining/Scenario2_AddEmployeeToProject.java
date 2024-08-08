package com.tekpyramid.requestchaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import com.tekpyramid.POJOClassUtility.EmployeePOJO;
import com.tekpyramid.POJOClassUtility.POJOClassUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario2_AddEmployeeToProject 
{
	@Test
	public void createDataIntoServer()
	{
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		
		POJOClassUtility pobj = new POJOClassUtility("Airtel"+ranNum,"Created","Suhas Sajjan",10);
		
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(pobj)
		.when()
			.post("http://49.249.28.218:8091/addProject");
		resp.then()
		.assertThat().statusCode(201)
		.log().all();
	
		//capture projectName from the response
		String projectName = resp.jsonPath().get("projectName");
		System.out.println(projectName);
		
		//API-2 ===> add employee to same project
		//String designation, String dob, String email, String empName, double experience,
		//String mobileNo, String project, String role, String username
		EmployeePOJO empObj = new EmployeePOJO("Architect","24/04/1985","suhas123@gmail.com","user_"+ranNum,18,"1234567890",projectName,"ROLE_EMPLOYEE","user_"+ranNum);
		given()
		.contentType(ContentType.JSON)
		.body(empObj)
		.when()
			.post("http://49.249.28.218:8091/employees")
			.then()
			.assertThat().statusCode(201)
			.log().all();
	}	
}
