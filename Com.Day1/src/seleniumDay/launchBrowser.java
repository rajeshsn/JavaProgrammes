package seleniumDay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.gargoylesoftware.htmlunit.javascript.host.XPathExpression;

public class launchBrowser{
	
	static WebDriver driver;
	/**
	This will Launch Web browser and maximise the browser and read URL from property file
	 */
	
	static void	launchChrome() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ReadConfigureFile.readConfig().getProperty("driverpath"));
		//driver.get(ReadConfigureFile.readConfig().getProperty("driverpath"));
		ChromeOptions options = new ChromeOptions();
		    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				  driver =new ChromeDriver(options);
				  driver.get(ReadConfigureFile.readConfig().getProperty("URL"));
				  driver.manage().window().maximize();;
				 Thread.sleep(300);
				 
}

/**
 This method will close the browser window
 */
public static void closeWindow () {
	
driver.quit();
		
			
	}

/**
 * 
 * @This method comparing the actual title of URl and expected URL
 * @Expected URL we have defined in the property file.
 */

public static  boolean getPageTitle(String expectedTitle) throws IOException{
	boolean compare =false;
	
	if (driver.getTitle().equals(expectedTitle))
	{
		compare=true;
	}
	return compare;

	
}

/**
 * 
 * we are giving input values from property file.
 */
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
public static void clickOnElement(String xpathExpression) throws IOException{
	
	//return driver.findElement(By.xpath(ReadConfigureFile.readConfig().getProperty("//*a[@href='http://demoqa.com/registration/']")));	
	
	driver.findElement(By.xpath(xpathExpression)).click();
	
	
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
}



	


