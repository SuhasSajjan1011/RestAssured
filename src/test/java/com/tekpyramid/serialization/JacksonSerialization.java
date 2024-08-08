package com.tekpyramid.serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(
		value = { "createdby",
				  "projectname",
				  "teamsize",
				  "status"
		}
	)
@JsonIgnoreProperties(
		value = {
				"teamsize"
		},allowSetters = true
		)

class Project                    //POJO class- POJO class means plain old java object.
{                                //Business class that is created during serialization is called POJO class{
	private String projectname;
	@JsonProperty(value = "created by")
	private String createdby;
	private int teamsize;
	private String status;
	public Project()    //Empty constructor is created in order to deserialize otherwise we will get exception
	{
		
	}
	public Project(String projectname, String createdby, int teamsize, String status) 
	{
		super();
		this.projectname = projectname;
		this.createdby = createdby;
		this.teamsize = teamsize;
		this.status = status;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

public class JacksonSerialization 
{
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException
	{
		Project pobj = new Project("Happy_Faces","Suhas Sajjan",10,"Created");
		
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./project.json"), pobj); //converting java object to json
		System.out.println("==========End=========");
	}
}
