package generic;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;


public class Excel {
	public static String getCellData(String path,String sheet,int r,int c ) 
	{
		String v="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			 v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			wb.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		return v;
		
	}
	
	

}
