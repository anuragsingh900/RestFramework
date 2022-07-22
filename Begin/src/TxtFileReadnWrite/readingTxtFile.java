package TxtFileReadnWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readingTxtFile 
{

	public void readCharacterByCharacter() throws IOException
	{
		File f=new File("../Begin/readnwrite.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!= -1)
		{
			System.out.println((char)a);
		}
	}
	
	public void readLineByLine() throws IOException
	{
		File f=new File("../Begin/readnwrite.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		while ((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		readingTxtFile rd=new readingTxtFile();
		rd.readLineByLine();
	}
}
