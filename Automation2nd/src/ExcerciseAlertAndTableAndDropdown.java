import java.lang.annotation.Annotation;

import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcerciseAlertAndTableAndDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'DEMO SITES')][1]"))).build().perform();
		
		//driver.findElement(By.xpath("//span[contains(text(),'Handling Alerts using Selenium WebDriver')][2]")).click();
		driver.findElement(By.xpath("//a[@href='http://toolsqa.com/handling-alerts-using-selenium-webdriver/']")).click();
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
