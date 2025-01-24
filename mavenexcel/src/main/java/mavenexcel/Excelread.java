package mavenexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String stringmethod(int a,int b) throws //a-row of cell,b=column of cell
IOException
	{
		f=new FileInputStream("C:\\Users\\user\\Desktop\\Hello.xlsx");//opening the file
		w=new XSSFWorkbook(f);//opening the workbook from file
		s=w.getSheet("Sheet1");//get the sheet
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();//return the string data from cells
	}
	
	public static String intmethod(int a,int b) throws 
	IOException
		{
			f=new FileInputStream("C:\\Users\\user\\Desktop\\Hello.xlsx");//opening the file
			w=new XSSFWorkbook(f);//opening the workbook from file
			s=w.getSheet("Sheet1");//get the sheet
			XSSFRow r=s.getRow(a);
			XSSFCell c=r.getCell(b);
			int y= (int) c.getNumericCellValue();//used to get the integer value and stored it in y
			return String.valueOf(y);//used to convert the int value to string value and return it to the main method.
		}
	
	
}
