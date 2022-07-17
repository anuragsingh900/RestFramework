package org.testing.utilities;

import org.json.JSONObject;

public class JsonParsingUsingOrgJson 
{

	public static String jsonParse(String body,String keyName)
	{
		JSONObject jo=new JSONObject(body);
		return jo.getString(keyName);
	}
}
