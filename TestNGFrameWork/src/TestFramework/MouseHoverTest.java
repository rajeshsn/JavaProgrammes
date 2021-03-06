package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {
	
	public static void main(String[] args) throws InterruptedException{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/");
    driver.manage().window().maximize();
	
	Thread.sleep(2000);
	

	WebElement element = driver.findElement(By.linkText("DEMO SITES"));
	 
    Actions action = new Actions(driver);

    action.moveToElement(element).build().perform();

    
}
}