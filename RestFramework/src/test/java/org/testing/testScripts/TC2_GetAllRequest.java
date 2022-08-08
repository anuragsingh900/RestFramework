package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAllRequest 
{
	@Test
	public void testCase2() throws IOException 
	{
	
		Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		HTTPMethods ht=new HTTPMethods(pr);
		ht.getAllRequest("QA_URI");
	}
}
