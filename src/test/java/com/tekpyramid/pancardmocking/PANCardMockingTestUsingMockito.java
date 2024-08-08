package com.tekpyramid.pancardmocking;

import org.mockito.Mockito;

import org.junit.*;

class PANCard1
{
	public String isValid(String panCard)
	{
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true)
		
			return "is valid pan";
		else
		
			return "is invalid pan";
	}
	/* Mocking Solution */
	public static PANCard1 getMockObject()
	{
		PANCard1 mocObj = Mockito.mock(PANCard1.class);
					Mockito.when(mocObj.isValid("ABCDE1234A")).thenReturn("valid PAN card");
					Mockito.when(mocObj.isValid("ABCDE1234B")).thenReturn("valid PAN card");
					Mockito.when(mocObj.isValid("ABCDE1234C")).thenReturn("Invalid PAN card");
					//Third PAN card is considered as invalid since it is not provided by developer
		return mocObj;
					
	}
}


public class PANCardMockingTestUsingMockito 
{
	public static void main(String[] args) 
	{
		PANCard1 obj = PANCard1.getMockObject();
		System.out.println(obj.isValid("ABCDE1234A"));
		System.out.println(obj.isValid("ABCDE1234B"));
		System.out.println(obj.isValid("ABCDE1234C"));
		System.out.println(obj.isValid("ABCDE1234D"));
		Assert.assertEquals(obj.isValid("ABCDE1234D"), "valid PAN card");
		System.out.println(obj.isValid("ABCDE1234D")); //This card is not added in the mocking solution.
		//Hence it gives null
	}
}