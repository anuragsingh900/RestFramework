package XLSReadnWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AssignmentDay13 
{

	public void ReadDataBasedUponRowNoAndColumnNo(int a, int b) throws BiffException, IOException
	{
		File f=new File("../Begin/TestFile.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if ((i==a)&&(j==b))
				{
					Cell wc=ws.getCell(j, i);
					System.out.println(wc.getContents());
				}
			}
		}
	}
	
	public void ReadDataBasedUponRowNo(int a) throws BiffException, IOException
	{
		File f=new File("../Begin/TestFile.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if (i==a)
				{
					Cell wc=ws.getCell(j, i);
					System.out.println(wc.getContents());
				}
			}
		}
	}
	
	public void ReadDataBasedUponRange(int a, int b) throws BiffException, IOException
	{
		File f=new File("../Begin/TestFile.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if ((i>=a)&&(i<=b))
				{
					Cell wc=ws.getCell(j, i);
					System.out.println(wc.getContents());
				}
			}
		}
	}
	
	public void WriteData(int a, int b) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../Begin/TestWriteFile.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Data2", 1);
		System.out.println("Please enter text ");
		Scanner s=new Scanner(System.in);
		String g=null;
		for(int i=0;i<=a;i++)
		{
			for (int j=0; j<=b;j++)
			{
				if ((i==a)&&(j==b))
				{
					g=s.next();
					Label L=new Label(j, i, g);
					ws.addCell(L);	
				}	
			}
		}
		wk.write();
		wk.close();
	}
	
	public void CopyPaste() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f=new File("../Begin/TestFile.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		File fi=new File("../Begin/TestWriteFile.xls");
		WritableWorkbook ww=Workbook.createWorkbook(fi);
		WritableSheet wt=ww.createSheet("Data3", 0);
		int r=ws.getRows();
		int c=ws.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc=ws.getCell(j, i);
				Label L=new Label(j,i,wc.getContents());
				wt.addCell(L);
			}
		}
		ww.write();
		ww.close();
		wk.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
	
		AssignmentDay13 q=new AssignmentDay13();
		q.CopyPaste();
	}
}
