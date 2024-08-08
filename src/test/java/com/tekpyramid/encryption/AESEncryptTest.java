package com.tekpyramid.encryption;

import org.testng.annotations.Test;

public class AESEncryptTest 
{
	@Test
	public void sampleTest() throws Exception
	{
		//This is an example of symmetric encryption where same keys are used.
		//Encrypting string data
		String privateKey = "AcO3tEam@j!tu_#1";
		String data = "SuhasSajjan";
		
		EncryptAndDecryptUtility ed = new EncryptAndDecryptUtility();
		System.out.println(ed.encrypt(data, privateKey));
		
		System.out.println(ed.decrypt("MjHLWdMroS1os2s+YcfHrQ==", privateKey));
		
		//Encrypting json data
		
		String privateKey1 = "AcO3tEam@j!tu_#1";
		String data1 = "{“name” : “Suhas”, “id” : “tp-1”}";
		
		EncryptAndDecryptUtility ed1 = new EncryptAndDecryptUtility();
		System.out.println(ed1.encrypt(data1, privateKey1));
		
		System.out.println(ed.decrypt("QKDFIDiXjiDKtwoiJ0iE3bE1YOzEHMq4LjyQZO9nN36eLQ9WaenMPs6DnlJbOOgmP9q7zEyu3ZexGrmOdS4l9g==", privateKey));
	}
}
