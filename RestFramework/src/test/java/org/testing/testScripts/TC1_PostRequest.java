package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ResponseValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.ExtentReport;
import org.testing.utilities.GenerateRandomNumber;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC1_PostRequest 

{
 static String responseidvalue;
 @Test
	public void testCase1() throws IOException 
	{
		ExtentReports report=ExtentReport.extent();
		ExtentTest test1=report.createTest("Test Case 1 Started");
	 
	 	Properties pr=PropertiesHandle.loadProperties("../RestFramework/URI.properties");
		String bodyData = JsonFileHandle.loadJson("../RestFramework/src/test/java/org/testing/resources/PostRequestPayload.json");
		Integer j =GenerateRandomNumber.number();
		bodyData=StringReplacement.replacement(bodyData, "id", j.toString());
		HTTPMethods ht=new HTTPMethods(pr);
		Response res=ht.postRequest(bodyData, "QA_URI");
		responseidvalue=JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
		ResponseValidate.statusCodeValidate(res, 201);
		ResponseValidate.dataValidate("Anurag", res, "[1].firstname");
		//System.out.println(responseidvalue);
		
		
	}
}
