package com.tekpyramid.pancardmocking;

import org.apache.commons.lang3.StringUtils;

import com.jayway.jsonpath.JsonPath;

import spark.Spark;


/* Mocking solution for credit card */
public class CreditCardMockingTest 
{
	public static void main(String[] args) 
	{
		Spark.port(8889);
		Spark.post("/credit-card", (req,res)->{
			String response = "";
			String card = JsonPath.read(req.body().toString(), "$.creditcard");
			//if(card.equals("1234567891234"))
			if(StringUtils.equalsAny(card, "1234567891234", "1234567891235"))
			{
				response = "{\"status\" :\"Payment success\"}";
				res.status(200);
			}
			else
			{
				response = "{\"status\" :\"Payment failed\"}" ;
				res.status(404);
			}
			res.type("application/json");
			return response ;
			
		});
		System.out.println("============Running==============");
	}
}
