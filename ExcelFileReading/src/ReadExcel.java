import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	public static void main (String[] args)throws IOException{
		
		File src=new File("C:\\Users\\Rajesh\\Desktop\\Software\\FileReading.xlsx");
	FileInputStream fis =new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 =wb.getSheetAt(0);
	
		String data0=sheet1.getRow(5).getCell(0).getStringCellValue();
		System.out.println("Data from excel sheet is"+ data0);
		
		String data1=sheet1.getRow(5).getCell(1).getStringCellValue();
		System.out.println("Data from excel sheet is"+ data1);
		
		wb.close();
		fis.close();
	}

}
