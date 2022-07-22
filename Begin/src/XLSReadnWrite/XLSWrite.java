package XLSReadnWrite;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLSWrite 
{

	public void writeXLS() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../Begin/TestWriteFile.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Data1", 0);
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				Label L=new Label(j, i, "Anurag");
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
	}
	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
	{
	
		XLSWrite xr=new XLSWrite();
		xr.writeXLS();
	}
}
