package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetRequest 
{
	@Test
	public void testCase3() throws IOException
	{
		Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		HTTPMethods ht=new HTTPMethods(pr);
		ht.getRequest("QA_URI", TC1_PostRequest.responseidvalue);
	}
}
