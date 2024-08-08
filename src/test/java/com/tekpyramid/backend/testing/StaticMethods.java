package com.tekpyramid.backend.testing;

import org.testng.annotations.Test;

public class StaticMethods 
{
	@Test
	public static void given()
	{
		System.out.println("execute given method");
	}
	public static void when()
	{
		System.out.println("execute when method");
	}
	public static void then()
	{
		System.out.println("execute then method");
	}
}
