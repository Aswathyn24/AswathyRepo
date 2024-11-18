package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f;  //to fetch file path
	public static XSSFWorkbook w; //to fetch workbook
	public static XSSFSheet s; //to fetch sheet in a workbook
	
	public static String readStringData(int i, int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\NK\\OneDrive\\Desktop\\ExcelReader.xlsx");
		w=new XSSFWorkbook(f);
        s=w.getSheet("Sheet1"); //getSheet is a predefined method
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
	
	public static double readIntegerData(int i, int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\NK\\OneDrive\\Desktop\\ExcelReader.xlsx");
		w=new XSSFWorkbook(f);
        s=w.getSheet("Sheet1"); //getSheet is a predefined method
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue();
		
	}

}
