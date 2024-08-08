package practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable
{
	String name;
	int level;
	long score;
	int life;
	
	public NFSGame(String name,int level,long score,int life)
	{
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
}

public class Serialization 
{
	public static void main(String[] args) throws IOException 
	{
		NFSGame userObj = new NFSGame("Suhas",2,5000,2);
		FileOutputStream fout = new FileOutputStream("./sample.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(userObj);
		System.out.println("=========End==============");
	}
}
