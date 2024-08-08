package practice.serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Project
{
	private String projectName;
	private String createdBy;
	private int teamSize;
	private String status;
	
	public Project()
	{
		
	}
	
	public Project(String projectName,String createdBy,int teamSize,String status)
	{
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}
		
	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}
	public String getCreatedBy()
	{
		return createdBy;
	}
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	public int getTeamSize()
	{
		return teamSize;
	}
	public void setTeamSize(int teamSize)
	{
		this.teamSize = teamSize;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}	
}


public class JacksonSerialization 
{
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException 
	{
		Project pObj = new Project("Operation blue","Suhas Sajjan",100,"Created");
		
		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./project1.json"), pObj);
		System.out.println("===========End=============");
		
	}
}
