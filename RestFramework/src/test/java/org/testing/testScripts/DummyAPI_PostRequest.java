package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.GenerateRandomNumber;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacement;

import io.restassured.response.Response;

public class DummyAPI_PostRequest 
{

	public void create() throws IOException
	{
		Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		String bodyData=JsonFileHandle.loadJson("../RestFramework/src/test/java/org/testing/resources/PostRequestPayload.json");
		//String uri= pr.getProperty("DUMMY_API")+"create";
		//Integer j=GenerateRandomNumber.number();
		//bodyData=StringReplacement.replacement(bodyData, "id", j.toString());
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postRequest(bodyData, "DUMMY_API");
		System.out.println(res);
	}
}
