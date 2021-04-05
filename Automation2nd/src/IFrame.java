import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.com/iframe-practice-page/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			//System.out.println(driver.findElements(By.tagName("iframe")).size());
			
			
		    driver .switchTo().frame("IF2");
		
		    Thread.sleep(2000);
		
			WebElement link = driver.findElement(By.xpath("//a[@href='http://toolsqa.wpengine.com/automation-practice-form/']"));
			
			link.click();
			
			//System.out.println(link.isDisplayed());
			
			
			driver.quit();
					
					
					
					
					
					

	}

}
