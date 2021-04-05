import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

//Actions actions = new Actions(driver);

//actions.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'DEMO SITES')][1]"))).click();

//actions.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'DEMO SITES')][1]"))).build().perform();

WebElement table = driver.findElement(By.tagName("tbody"));

List<WebElement> row =driver.findElements(By.tagName("tr"));

List<String> list1 =new ArrayList<String>();

for(int i =0; i<row.size();i++){
	
	List<WebElement> cols= row.get(i).findElements(By.tagName("td"));
	
	for (int j=0; j<cols.size();j++){
		
		list1.add(cols.get(j).getText());
		
	}
}
	
	System.out.println(list1);
	if(list1.contains("China"))
	{
		System.out.println("present");
	}

	
//driver.quit();	
	}


	
}


 

	


