package practice.responsevalidation;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class VerifyResponseTime 
{
	@Test
	public void verifyTime()
	{
		Response resp = given()
				.get("http://49.249.28.218:8091/projects");
		
		resp.then().log().all();
		long time =resp.time();
		long timeInSec = resp.timeIn(TimeUnit.SECONDS);
		
		System.out.println(time);
		System.out.println(timeInSec);
		resp.then().assertThat().time(Matchers.lessThan(900L));
		resp.then().assertThat().time(Matchers.greaterThan(100L));
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(100l)));
	}
}
