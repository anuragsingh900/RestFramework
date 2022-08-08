package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacement;
import org.testng.annotations.Test;

public class TC4_UpdateRequest 
{
	@Test
	public void testCase4() throws IOException
	{
		Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		String bodyData=JsonFileHandle.loadJson("../RestFramework/src/test/java/org/testing/resources/PutRequestPayload.json");
		String updatedData=StringReplacement.replacement(bodyData, "id", TC1_PostRequest.responseidvalue);
		HTTPMethods http=new HTTPMethods(pr);
		http.updateRequest(updatedData, "QA_URI", TC1_PostRequest.responseidvalue);
		
	}
}
