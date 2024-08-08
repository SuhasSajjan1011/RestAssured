package com.tekpyramid.pancardmocking;

class PANCard
{
	public static String isValid(String panCard)
	{
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true)
		
			return "is valid pan";
		else
		
			return "is invalid pan";
	}
}


public class PANCardMockingTest 
{
	public static void main(String[] args) 
	{
		System.out.println(PANCard.isValid("ABCDE1234A"));
	}
}