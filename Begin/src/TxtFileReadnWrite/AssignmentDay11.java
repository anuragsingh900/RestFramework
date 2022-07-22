package TxtFileReadnWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AssignmentDay11 
{

	public void ReadData(int a) throws IOException
	{
		File f=new File("../Begin/readnwrite.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int z=0;
		String s;
		while ((s=b.readLine()) != null)
		{
				
			z=z+1;
			if (z==a)
			{
				System.out.println(s);
				break;
			}
		}
	}
	
	public void ReadDataofRange(int a, int b) throws IOException
	{
		File f=new File("../Begin/readnwrite.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int z=0;
		String s;
		while ((s=br.readLine()) != null)
		{
				
			z=z+1;
			if ((z>=a) && (z<=b))
			{
				System.out.println(s);
			}
		}
	}
	
	public void WriteData(int a) throws IOException
	{
		File f=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Please enter text");
		Scanner s=new Scanner(System.in);
		String j;
		
		for (int i=1;i<=a;i++)
		{
			j=s.next();
			bw.write(j);
			bw.newLine();
		}
		bw.close();
	}
	
	public void WriteDataInRange(int a, int b) throws IOException
	{
		File f=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Please enter text");
		Scanner s=new Scanner(System.in);
		String j;
		bw.newLine();
		for (int i=a;i<=b;i++)
		{
			j=s.next();
			bw.write(j);
			bw.newLine();
		}
		bw.close();
	}
	
	public void CopyPaste() throws IOException 
	{
		File f=new File("../Begin/readnwrite.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		File fe=new File("../Begin/writeonly.txt");
		FileWriter fw=new FileWriter(fe);
		BufferedWriter bw=new BufferedWriter(fw);
		String a;
		while ((a=br.readLine())!=null)
		{
			bw.write(a);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
	
		AssignmentDay11 ad=new AssignmentDay11();
		ad.CopyPaste();
	}
	
}
