package com.tekpyramid.serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDeserialization 
{
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException 
	{
		ObjectMapper objm = new ObjectMapper();
		
		Project pobj = objm.readValue(new File("./project.json"), Project.class);
		
		System.out.println(pobj.getProjectname());
		System.out.println(pobj.getTeamsize());
		System.out.println(pobj.getCreatedby());
		System.out.println(pobj.getStatus());
	}
}
