package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public void getRequest(String uriKey,String KeyValue)
	{
		String uri=pr.getProperty(uriKey) + "/" + KeyValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("********Respnse is**********");
		System.out.println(res.asString());
	}
	
	public void getAllRequest(String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("********Respnse is**********");
		System.out.println(res.asString());
	}
	
	public Response postRequest(String bodyData, String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(uriKey));
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("********Respnse is**********");
		System.out.println(res.asString());
		
		return res;
	}
}
