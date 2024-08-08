package practice.serialization;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Project1
{
	private String projectName;
	private String projectStatus;
	private List<String> teamMember;
	private ProjectManager projectManager;
	
	public Project1(String projectName, String projectStatus,List<String> teamMember,ProjectManager projectManager)
	{
		super();
		this.projectName = projectName;
		this.projectStatus = projectStatus;
		this.teamMember = teamMember;
		this.projectManager = projectManager;
	}
	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}
	public String getProjectStatus()
	{
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus)
	{
		this.projectStatus = projectStatus;
	}
	public List<String> getTeamMember()
	{
		return teamMember;
	}
	public void setTeamMember(List<String> teamMember)
	{
		this.teamMember = teamMember;
	}
	public ProjectManager getProjectManager()
	{
		return projectManager;
	}
	public void setProjectManager(ProjectManager projectManager)
	{
		this.projectManager = projectManager;
	}
}

class ProjectManager
{
	private String name;
	private String id;
	
	public ProjectManager(String name, String id)
	{
		super();
		this.name = name;
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
}

public class POJO 
{
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException 
	{
		List<String> ls = new ArrayList<String>();
		ls.add("John");
		ls.add("David");
		ls.add("Steve");
		
		ProjectManager pm = new ProjectManager("Sagar","tp01");
		Project1 pObj = new Project1("Operation Halley","Created",ls,pm);
		
		System.out.println(pObj.getProjectName());
		System.out.println(pObj.getProjectStatus());
		
		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./POJO1.json"), pObj);
	}
}
