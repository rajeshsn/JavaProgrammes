package AutomationSelenium;

import java.io.IOException;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import AutomationSelenium.ReadConfigureFile;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		String browser =ReadConfigureFile.readConfig().getProperty("Browser");
		if(browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", ReadConfigureFile.readConfig().getProperty("DriverChrome"));
			
			ChromeOptions options = new ChromeOptions();
			    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
			    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
					  driver =new ChromeDriver(options);
					  driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
					  driver.manage().window().maximize();;
					  Thread.sleep(3000);
		}
		else if(browser.equals("IE"))
		{
			
			DesiredCapabilities desiredCapabilities =DesiredCapabilities.internetExplorer();
			desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
			desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			System.setProperty("webdriver.ie.driver", ReadConfigureFile.readConfig().getProperty("DriverIE"));
		
					  driver =new InternetExplorerDriver();
					  driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
					  driver.manage().window().maximize();;
					  Thread.sleep(3000);
		}
		else if (browser.equals("FIREFOX")){
			
			System.setProperty("webdriver.firefox.driver", ReadConfigureFile.readConfig().getProperty("DriverFirefox"));
			
		              driver =new FirefoxDriver();
					  driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
					  driver.manage().window().maximize();;
					  Thread.sleep(3000);
		}
		

	}
}