package SeleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("profile_pic_10")).click();
		StringSelection selection = new StringSelection("C:\\Users\\Rajesh\\Desktop\\Rajesh Negi_CV (Automation Testing)");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
	robot.keyPress(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyRelease(KeyEvent.VK_V);
	
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	


	}

}
