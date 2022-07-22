package TxtFileReadnWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingTxtFile 
{

	public void writingSingleLine() throws IOException 
	{
	
		File f=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("My name is anurag");
		fw.close();
	}
	
	public void writingMultipleLine() throws IOException
	{
	
		File f=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello World");
		bw.newLine();
		bw.write("My name is Anurag");
		bw.newLine();
		bw.close();
	}
	
	public void writingAppendText() throws IOException
	{
		File f=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("Hello Again");
		bw.newLine();
		bw.write("Like I said my name is Anurag");
		bw.newLine();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
	
		writingTxtFile wt=new writingTxtFile();
		wt.writingAppendText();
	}
}
