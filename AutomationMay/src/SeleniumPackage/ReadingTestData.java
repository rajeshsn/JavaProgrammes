package SeleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTestData {

	public static String readVals(int row , int col) throws Exception {
		// TODO Auto-generated method stub
     File file = new File("C:\\Users\\Rajesh\\Desktop\\TestData.xlsx");
     
     FileInputStream fs = new FileInputStream(file);
     
     XSSFWorkbook workbook = new XSSFWorkbook(fs);
     XSSFSheet sheet = workbook.getSheet("Sheet1");
     
   
   String value = sheet.getRow(row).getCell(col).getStringCellValue();
  return value;
	}
	
	public static ArrayList<String> readvaluesByTestName(String testName) throws IOException{
		
		 File file = new File("C:\\Users\\Rajesh\\Desktop\\TestData.xlsx");
	     
	     FileInputStream fs = new FileInputStream(file);
	     
	     XSSFWorkbook workbook = new XSSFWorkbook(fs);
	     XSSFSheet sheet = workbook.getSheet("Sheet1");
	     
	     ArrayList<String> list = new ArrayList<String>();
	     
	     for (int i =0; i<sheet.getLastRowNum()+1;i++)
	     {
	    	 if(sheet.getRow(i).getCell(0).getStringCellValue().equals(testName))
	    	 {
	    		 for (int j =1;j<sheet.getRow(i).getLastCellNum();j++)
	    		 {
	    			 list.add(sheet.getRow(i).getCell(j).getStringCellValue());
	    		 }
	    	 }
	     }
		
		return list;
		
		
	}

	

}

