package com.tekpyramid.backend.testing;

import org.testng.annotations.Test;

public class MethodChaining 
{
	@Test
	public void a()   //traditional method of calling without chaining
	{
		System.out.println("execute method a");
	}
	public void b()   //traditional method of calling without chaining
	{
		System.out.println("execute method b");
	}
	public void c()   //traditional method of calling without chaining
	{
		System.out.println("execute method c");
	}
	
	/* Method Chaining concept */
	public MethodChaining d()
	{
		System.out.println("execute method d");
		return new MethodChaining();
	}
	public MethodChaining e()
	{
		System.out.println("execute method e");
		return new MethodChaining();
	}
	public MethodChaining f()
	{
		System.out.println("execute method f");
		return new MethodChaining();
	}
	
	/*Method Chaining concept with one of the return type as void*/
	public MethodChaining g()
	{
		System.out.println("execute method g");
		return new MethodChaining();
	}
	public void h()
	{
		System.out.println("execute method h");
	}
	public MethodChaining i()
	{
		System.out.println("execute method i");
		return new MethodChaining();
	}
	
	/*Method chaining where method returns other class object*/
	public MethodChaining j()
	{
		System.out.println("execute method j");
		return new MethodChaining();
	}
	public MethodChaining k()
	{
		System.out.println("execute method k");
		return new MethodChaining();
	}
	public MethodChainingOtherClass l()
	{
		System.out.println("execute method l");
		return new MethodChainingOtherClass();
	}
	
	/*Creating static methods which returns either current class object or other class object*/
	public static MethodChaining n()
	{
		System.out.println("execute method n");
		return new MethodChaining();
	}
	public static MethodChaining o()
	{
		System.out.println("execute method o");
		return new MethodChaining();
	}
	public static MethodChainingOtherClass p()
	{
		System.out.println("execute method p");
		return new MethodChainingOtherClass();
	}
	
	
	
	
}
