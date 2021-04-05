import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelAll1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Rajesh\\Desktop\\Software\\FileReading.xlsx");
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("Number of rows are :"+rowcount);
		
		for  (int i=0;i<=rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from excel sheet is"+ data0);
		}
		
		System.out.println("************Second Coloum**************");
		
			for(int j=0;j<=rowcount;j++){
				String data1=sheet1.getRow(j).getCell(1).getStringCellValue();
				System.out.println("Data from excel sheet is"+ data1);
				
			}
			
		wb.close();
		fis.close();
			
	}

}
