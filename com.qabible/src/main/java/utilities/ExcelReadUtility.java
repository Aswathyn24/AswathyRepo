package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReadUtility {

	public static FileInputStream filepath; // fetch file
	public static XSSFWorkbook workBook; // fetch workbook
	public static XSSFSheet sheet; // fetch excel sheet
	
	@DataProvider(name="logindataprovider")
	public static Object[][] readExcelData() throws IOException {
		
		filepath = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//excelread.xlsx"); 
		workBook = new XSSFWorkbook(filepath); // method to fetch workbook from file
		sheet = workBook.getSheet("Sheet1"); // method to get sheet from workbook
		XSSFRow row = sheet.getRow(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int columncount = row.getLastCellNum();

		Object[][] data = new Object[rowcount][columncount];
		
		for (int i = 0; i < rowcount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;
	}
}
