package org.testing.responseValidation;

import org.testing.utilities.JsonParsingUsingJsonPath;

import io.restassured.response.Response;

public class ResponseValidate 
{

	public static void statusCodeValidate(Response res, int expectedStatusCode)
	{
		if(expectedStatusCode==res.getStatusCode())
		{
			System.out.println("Status code is matching");
		}
		else
		{
			System.out.println("Status code is not matching");
		}
	}
	
	public static void dataValidate(String expectedData,Response res,String jsonPath)
	{
		String actualData=JsonParsingUsingJsonPath.jsonParse(res, jsonPath);
	}
}
