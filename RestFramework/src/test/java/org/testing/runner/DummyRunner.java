package org.testing.runner;

import java.io.IOException;

import org.testing.testScripts.DummyAPI_PostRequest;

public class DummyRunner 
{

	public static void main(String[] args) throws IOException 
	{
		DummyAPI_PostRequest dm=new DummyAPI_PostRequest();
		dm.create();
	}
	
}
