package com.tekpyramid.POJOClassUtility;

public class POJOClassUtility 
{
	String projectName;
	String status;
	String createdBy;
	int teamSize;
	
	public POJOClassUtility()
	{
		
	}
	
	
	public POJOClassUtility(String projectName, String status, String createdBy, int teamSize) 
	{
		super();
		this.projectName = projectName;
		this.status = status;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
	}


	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
