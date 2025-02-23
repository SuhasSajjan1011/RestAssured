package com.tekpyramid.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

	class Project1 {

	   String projectName;
	   String projectStatus;
	   int teamSize;
	   List<String> teamMember;
	   ProjectManager projectManager;
	   
    public Project1(String projectName, String projectStatus, int teamSize, List<String> teamMember,
			ProjectManager projectManager) 
    {
		super();
		this.projectName = projectName;
		this.projectStatus = projectStatus;
		this.teamSize = teamSize;
		this.teamMember = teamMember;
		this.projectManager = projectManager;
	}
	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }
    
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    public String getProjectStatus() {
        return projectStatus;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setTeamMember(List<String> teamMember) {
        this.teamMember = teamMember;
    }
    public List<String> getTeamMember() {
        return teamMember;
    }
    
    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }
    public ProjectManager getProjectManager() {
        return projectManager;
    }
    
}
class ProjectManager 
{

	    String name;
	    String empId;
	    
	    public ProjectManager(String name, String empId) 
	    {
			super();
			this.name = name;
			this.empId = empId;
		}
		public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
	    
	    public void setEmpId(String empId) {
	        this.empId = empId;
	    }
	    public String getEmpId() {
	        return empId;
	    }
	    
}

public class POJO 
{
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException 
	{
			List<String> lst = new ArrayList<String>();
			lst.add("John");
			lst.add("David");
			lst.add("Steve");
			
			ProjectManager pm = new ProjectManager("Sagar","tp01");
			Project1 projectObj = new Project1("Suhas Sajjan","Created",10,lst,pm);
			
			System.out.println(projectObj.projectName);
			System.out.println(projectObj.projectStatus);
			
			ObjectMapper objM = new ObjectMapper();
			objM.writeValue(new File("./POJO.json"), projectObj); //converting java object back to json
	}
}
