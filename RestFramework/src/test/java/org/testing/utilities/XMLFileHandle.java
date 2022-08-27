package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XMLFileHandle 
{

	public static String xmlFile(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data="";
		String s;
		while((s=br.readLine())!=null)
		{
			data=data+s;
		}
		return data;
	}
}
