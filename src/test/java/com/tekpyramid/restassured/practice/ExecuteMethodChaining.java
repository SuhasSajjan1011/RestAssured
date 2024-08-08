package com.tekpyramid.restassured.practice;

import org.testng.annotations.Test;

import com.tekpyramid.backend.testing.MethodChaining;


import static com.tekpyramid.backend.testing.MethodChaining.*;


public class ExecuteMethodChaining 
{
	@Test
	public void executeChaining()
	{
		MethodChaining mc = new MethodChaining();
		System.out.println("--------Without Method Chaining---------------");
		mc.a(); //traditional method of calling without chaining
		mc.b(); //traditional method of calling without chaining
		mc.c(); //traditional method of calling without chaining
		
		/* Method Chaining Concept */
		System.out.println("-----------------With Method Chaining-----------------------");
		mc.d().e().f();
		
		/*Method Chaining concept with one of the return type as void*/
		System.out.println("----------Method Chaining concept with one of the return type as void----------------");
		mc.g().h(); //can't achieve method chaining for i method because return type of h method is void
		
		/*Method chaining where method returns other class object*/
		System.out.println("-----------Method chaining where method returns other class object-------------");
		mc.j().k().l().m();
		
		/*Creating static methods which returns either current class object or other class object*/
		System.out.println("--------Creating static methods which returns either current class object or other class object----------");
		n().o().p().m();  // no need to use reference variable of any class to call static methods.just static import statement is required.
	}
	
}
