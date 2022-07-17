package org.testing.utilities;

import java.util.regex.Pattern;

//input ---> json file(String Data)
//input ---> key name
//input ---> key value

public class StringReplacement 
{

	public static String replacement(String completeData,String keyName,String keyValue)
	
	{
		completeData = completeData.replaceAll(Pattern.quote("{{"+keyName+"}}"), keyValue);
		return completeData;
	}
}
