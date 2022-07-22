package ExcelFileReadnWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWrite 
{

	public void writingExcel() throws IOException
	{
		File f= new File("../Begin/Book2.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("New");
		
		for (int i=0;i<5;i++)
		{
			XSSFRow xr=xt.createRow(i);
			for (int j=0;j<5;j++)
			{
				XSSFCell xc=xr.createCell(j);
				xc.setCellValue("Anurag");
			}
		}
		xs.write(fo);
		fo.flush();
		fo.close();
		
	}
	
	public static void main(String[] args) throws IOException 
	{
	
		ExcelFileWrite ex=new ExcelFileWrite();
		ex.writingExcel();
	}
}
