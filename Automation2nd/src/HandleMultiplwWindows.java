import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiplwWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String parentWin =driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(2000);
		
		Set<String> child = driver.getWindowHandles();
		
		for (String s:child){
			if (!s.equals(parentWin)){
				
				driver.switchTo().window(s);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWin);
		

	}

}
