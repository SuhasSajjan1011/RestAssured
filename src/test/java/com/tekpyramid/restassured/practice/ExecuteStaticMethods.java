/* Static import-- import static package.ClassName.*;*/
package com.tekpyramid.restassured.practice;

import org.testng.annotations.Test;

/* With using class name*/
/*import com.tekpyramid.backend.testing.StaticMethods;*/

/*With using static import*/
import static com.tekpyramid.backend.testing.StaticMethods.*;

public class ExecuteStaticMethods 
{
	@Test
	public void executeMethods()
	{
		/* with using class name
		StaticMethods.given();
		StaticMethods.when();
		StaticMethods.then();*/
		
		given();
		when();
		then();
		
	}
}
