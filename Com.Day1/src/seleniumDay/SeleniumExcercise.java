package seleniumDay;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.FindElements;

public class SeleniumExcercise {

	private static boolean compare;
	private static boolean comapre;

	public static void main(String[] args) throws InterruptedException, IOException {
		launchBrowser.launchChrome();
		
		//******Testcase-01******
		//System.out.println(launchBrowser.getPageTitle(ReadConfigureFile.readConfig().getProperty("pageTitle")));
		
		//launchBrowser.addValue();
		
		//System.out.println(launchBrowser.getLinkSize("input").size());
		
		//launchBrowser.driver.findElement(By.xpath("//*a[@href='http://demoqa.com/registration/']")).click();
	
     System.out.println(launchBrowser.isElementVisible("name_3_firstname"));

			
		
		
		//launchBrowser.clickOnElement("//a[@href='http://demoqa.com/registration/']");

		
		//launchBrowser.driver.findElement(By.id("name_3_firstname")).sendKeys("ABC");
		
		//***********TestCase-003*****
		//launchBrowser.inputValue("//*[@id='name_3_firstname']", "ABC");
		
		Thread.sleep(3000);
				
        launchBrowser.closeWindow();
   
	}

}
