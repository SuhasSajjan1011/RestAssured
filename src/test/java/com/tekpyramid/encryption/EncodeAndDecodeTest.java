package com.tekpyramid.encryption;

import java.util.Base64;

import org.testng.annotations.Test;

public class EncodeAndDecodeTest 
{
	@Test
	public void sampleTest()
	{
		String encodedData = new String(Base64.getEncoder().encode("ABC".getBytes()));
		System.out.println(encodedData);
		
		String decodedData = new String(Base64.getDecoder().decode("QUJD".getBytes()));
		System.out.println(decodedData);
		
		String encodedData1 = new String(Base64.getEncoder().encode("rmgyantra:rmgy@9999".getBytes()));
		System.out.println(encodedData1);
		
		String decodedData1 = new String(Base64.getDecoder().decode("cm1neWFudHJhOnJtZ3lAOTk5OQ==".getBytes()));
		System.out.println(decodedData1);
		
	}
}
