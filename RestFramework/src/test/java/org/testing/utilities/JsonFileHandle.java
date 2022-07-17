package org.testing.utilities;

//input parameter is File Path
//output parameter is String

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileHandle 
{
	public static String loadJson(String filePath) throws FileNotFoundException
	{
		File f= new File(filePath);
		FileReader fr=new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject jb=new JSONObject(js);
		return jb.toString();
		
	}
}
