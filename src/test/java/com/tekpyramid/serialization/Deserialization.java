package com.tekpyramid.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Deserialization 
{
	public static void main(String[] args) throws Throwable 
	{
		FileInputStream input = new FileInputStream("./f.txt");
		
		ObjectInputStream objin = new ObjectInputStream(input);
		NFSGame user1obj = (NFSGame)objin.readObject();
		
		System.out.println(user1obj.name);
		System.out.println(user1obj.level);
		System.out.println(user1obj.score);
		System.out.println(user1obj.life);
		
	}
}
