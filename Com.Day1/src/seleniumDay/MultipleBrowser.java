package seleniumDay;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultipleBrowser {

	public static void main(String[] args) {
		
		String browser =ReadConfigureFile.readConfig().getProperty("Browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ReadConfigureFile.readConfig().getProperty("driverpath"));
			//driver.get(ReadConfigureFile.readConfig().getProperty("driverpath"));
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
			desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,);
			System.setProperty("webdriver.ie.driver", ReadConfigureFile.readConfig().getProperty("driverpath"));
			//driver.get(ReadConfigureFile.readConfig().getProperty("driverpath"));
			ChromeOptions options = new ChromeOptions();
			    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
			    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
					  driver =new ChromeDriver(options);
					  driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
					  driver.manage().window().maximize();;
					  Thread.sleep(3000);
		}
		else if (browser.equals("firefox")){
			
			System.out.println("Execute firefox browser");
		}
			

	}

}
