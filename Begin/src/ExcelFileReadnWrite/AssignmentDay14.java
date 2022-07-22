package ExcelFileReadnWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentDay14 
{

	public void ReadDataBasedUponRowNoAndColumnNo(int a, int b) throws IOException
	{
		File f=new File("../Begin/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xk=new XSSFWorkbook(fi);
		XSSFSheet xs=xk.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				if((i==a)&&(j==b))
				{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
				}
			}
		}
	}
	
	public void ReadDataBasedUponRowNo(int a) throws IOException
	{
		File f=new File("../Begin/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xk=new XSSFWorkbook(fi);
		XSSFSheet xs=xk.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				if(i==a)
				{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
				}
			}
		}
	}
	
	public void ReadDataBasedUponRange(int a, int b) throws IOException
	{
		File f=new File("../Begin/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xk=new XSSFWorkbook(fi);
		XSSFSheet xs=xk.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				if((i>=a)&&(i<=b))
				{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
				}
			}
		}
	}
	
	public void WriteData(int a, int b) throws IOException
	{
		File f= new File("../Begin/Book2.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("New");
		System.out.println("Please enter ");
		Scanner s=new Scanner(System.in);
		String g=null;
		for (int i=0;i<a;i++)
		{
			XSSFRow xr=xt.createRow(i);
			for (int j=0;j<b;j++)
			{
				XSSFCell xc=xr.createCell(j);
				g=s.next();
				xc.setCellValue(g);
			}
		}
		xs.write(fo);
		fo.flush();
		fo.close();	
	}
	
	public void CopyPaste() throws IOException
	{
		File f=new File("../Begin/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xk=new XSSFWorkbook(fi);
		XSSFSheet xs=xk.getSheetAt(0);
		File fii= new File("../Begin/Book2.xlsx");
		FileOutputStream fo=new FileOutputStream(fii);
		XSSFWorkbook xk1=new XSSFWorkbook();
		XSSFSheet xs1=xk1.createSheet("New");
		int r=xs.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
	
		AssignmentDay14 ad=new AssignmentDay14();
		ad.WriteData(2,6);
	}
}