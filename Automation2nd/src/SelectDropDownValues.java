import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Select select = new Select(driver.findElement(By.id("mm_date_8")));
		
		//select.selectByVisibleText("4");
		
		Select select1 = new Select(driver.findElement(By.id("dropdown_7")));
		
		select1.selectByIndex(10);
		
		Thread.sleep(2000);
		
		/*List<WebElement> dd = driver.findElements(By.id("dropdown_7"));
		
		
		
		for(WebElement ele: dd)

		{

		System.out.println(ele.getText());
		}*/

		
	   /* //Get the length
	    System.out.println(dd.size());

	    // Loop to print one by one
	    for (int j = 0; j < dd.size(); j++) {
	        System.out.println(dd.get(j).getText());

	    }*/
		

driver.quit();
	}
}


