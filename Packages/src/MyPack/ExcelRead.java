package MyPack;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelRead(String path)throws IOException{
		
		try{
			File src=new File(path);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb= new XSSFWorkbook(fis);
			
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
	}
			
	 public void getData(int sheetnum, int row, int col)  {
	       
	        
	        	sheet=wb.getSheetAt(sheetnum);
	    		
	    		String data=sheet.getRow(row).getCell(col).getStringCellValue();
				return data;

	                    }
	                    	
	                    
	        
	    	wb.close();
			fis.close();
	       	
			
		                      
}

	


