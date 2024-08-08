package com.tekpyramid.pancardmocking;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreditCardPaymentTest 
{
	@Test
	public void sampleTest()
	{
		JSONObject obj = new JSONObject();
		obj.put("creditcard", "1234567891234");
		obj.put("cvv", "123");
		obj.put("cardName", "Suhas Sajjan");
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
			.post("http://localhost:8889/credit-card")
		.then().log().all();
	}
	
}
