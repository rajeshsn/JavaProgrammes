package SeleniumPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBrowser {

	public static WebDriver launchBrowser() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		return driver;
		
		
		
	}
	public static void hitApplicationURL(WebDriver driver) throws IOException{
		
		driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
	}
	
	
}
