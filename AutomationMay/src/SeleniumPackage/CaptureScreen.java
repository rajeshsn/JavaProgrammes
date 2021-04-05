package SeleniumPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//File srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(srcPath, new File("./Screenshot/screen.png"));
		
		CommonUtility.Capturescreen(driver, "test");
		
		
		

	}

}
