package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s=ExcelCode.readStringData(0,0);
		double d=ExcelCode.readIntegerData(0,1);
		System.out.println(s);
		System.out.println(d);
		
		

	}

}
