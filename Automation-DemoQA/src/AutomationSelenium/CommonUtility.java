package AutomationSelenium;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonUtility {

	static WebDriver driver;
	
	public static void launchBrowser() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
		driver=new ChromeDriver();
		driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	
	
	public static void closeWindow()
	{
		driver.quit();
	}
	
	public static boolean getPageTitle(String expectedtitle) throws IOException{
		
		boolean compare=false;
		
		if (driver.getTitle().equals(expectedtitle))
		{
			compare =true;
		}
			return compare;
	}
	
	public static void addValue() throws IOException{
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add(ReadConfigureFile.readConfig().getProperty("value1"));
		al.add(ReadConfigureFile.readConfig().getProperty("value2"));
		al.add(ReadConfigureFile.readConfig().getProperty("value3"));
		
		Iterator itr = al.iterator();
		 while(itr.hasNext())
				 {
			 System.out.println(itr.next());
				 }
	
}
	public static List<WebElement> getLinkSize(String tagToFind){
		
		return driver.findElements(By.tagName("tagToFind"));
		
}
	/**
	 * This method find the element using xpath and click on that
	 * @param xpathExpression
	 * @throws IOException
	 */
	public static void clickOnElement(String expression) throws IOException{
		
		//return driver.findElement(By.xpath(ReadConfigureFile.readConfig().getProperty("//*a[@href='http://demoqa.com/registration/']")));	
		
		//driver.findElement(By.xpath(expression)).click();
		driver.findElement(By.cssSelector(expression)).click();
		
		
	}
	
	/**
	 * This method send the values to the text box
	 * @param path
	 * @param value
	 * @throws IOException
	 */

	public static void inputValue(String path,String value) throws IOException{
		
		//return driver.findElement(By.xpath(ReadConfigureFile.readConfig().getProperty("//*a[@href='http://demoqa.com/registration/']")));	
		
		driver.findElement(By.xpath(path)).sendKeys(value);
		

}
	/**
	 * To check if element is present or not
	 * @param id
	 * @return
	 */
	public static boolean isElementVisible(String id){
		
		boolean visibility = false;
		int sz =driver.findElements(By.id(id)).size();
		
		if(sz==0){
			visibility=true;
			
		}
		return visibility;
	}

public static  Select selectDropDown(String paths,String text){
	
	Select element = new Select( driver.findElement(By.xpath(paths)));
	
	  element.selectByVisibleText(text);;
	  
	  return element;
	  
	  
}

public static String uploadFile(String pathx, String url ){
	
	driver.findElement(By.xpath(pathx)).sendKeys(url);
	
	return url;
	
	
	
}

public static void waitTillMethodVisible(WebDriver driver,String path , int timeUnit){
	
	
	WebDriverWait wait = new WebDriverWait(driver, timeUnit);
	

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	
}

public static void Capturescreen(WebDriver driver, String screenName) throws IOException{
	
	File srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcPath, new File("./Screenshot/"+screenName+"_screen.png"));
}




}

