package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		RegistrationPage.driver=new ChromeDriver();
		RegistrationPage.driver.get("http://demoqa.com/registration/");
		RegistrationPage.driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
	}

}
