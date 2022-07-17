package org.testing.runner;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetRequest;

public class Runner 
{

	public static void main(String[] args) throws IOException 
	{
	
		TC1_PostRequest tc1=new TC1_PostRequest();
		tc1.testCase1();
		
		
		 TC2_GetAllRequest tc2=new TC2_GetAllRequest(); 
		 tc2.testCase2();
		 
		 TC3_GetRequest tc3=new TC3_GetRequest(); 
		 tc3.testCase3();
		 
	}
}
