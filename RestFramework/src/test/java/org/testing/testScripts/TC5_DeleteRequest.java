package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_DeleteRequest 
{
	@Test
	public void testCase5() throws IOException
	{
		Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.deleteRequest("QA_URI", TC1_PostRequest.responseidvalue);
		
	}
}
