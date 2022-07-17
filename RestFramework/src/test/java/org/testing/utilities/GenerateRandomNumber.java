package org.testing.utilities;

import java.util.Random;

public class GenerateRandomNumber 
{

	public static Integer number() 
	{
	
		Random r=new Random();
		Integer i=r.nextInt();
		return i;
	}

}
