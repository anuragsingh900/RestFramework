package ExcelFileReadnWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead 
{
	public void readingExcel() throws InvalidFormatException, IOException 
	{
		File f=new File("../Begin/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		int r=xt.getPhysicalNumberOfRows();
		
		for (int i=0;i<r;i++)
		{
			XSSFRow xr=xt.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for (int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
		}
		xs.close();
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		ExcelFileRead ex=new ExcelFileRead();
		ex.readingExcel();
	}
}
