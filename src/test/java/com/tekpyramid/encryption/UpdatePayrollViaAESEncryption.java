package com.tekpyramid.encryption;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class UpdatePayrollViaAESEncryption 
{
	@Test
	public void sampleTest() throws Exception
	{
		EncryptAndDecryptUtility ed = new EncryptAndDecryptUtility();
		String jBody = "{\"basicPlusVda\": 60000,\"hra\": 5000,\"insurance\": 5000,\"lta\":10000,\"lwf\": 200,\"netPay\":72000,\"payroll_id\": 210,\"pf\":6000,\"pt\":200,\"stat_bonus\":4000,\"status\":\"Active\"}";

		String jReqBody = ed.encrypt(jBody,"Ac03tEam@j!tu_#1");
		System.out.println(jReqBody);
		
		Response resp = given()
			.body(jReqBody)
		.when()
			.put("http://49.249.28.218:8091/payroll");
		resp.then().log().all();
		
		String respBody = ed.decrypt(resp.getBody().asString(), "Ac03tEam@j!tu_#1");
		System.out.println(respBody);
	}
}
