package SeleniumPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestCases extends GetBrowser {
	
	static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException, IOException{
		
		driver= launchBrowser();
		
		hitApplicationURL(driver);
		
		
	}

}
