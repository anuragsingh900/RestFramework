package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{

	public static String jsonParse(Response res, String jsonPath)
	{
		return res.jsonPath().getString(jsonPath);
	}
}
