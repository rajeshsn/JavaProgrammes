package TestFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethod {
	
	public boolean checkElementExists(WebDriver driver , String id)
	
	{
		
		return driver.findElement(By.id(id)).isDisplayed();
	}
	
	public void enterDataInTextField(WebDriver driver, String id , String dataToEnter)
	
	{
		driver.findElement(By.id(id)).sendKeys(dataToEnter);
	}
	
	/**
	 * This method find the element using xpath and click on that
	 * @param xpathExpression
	 * @throws IOException
	 */
	public static void clickOnElement(WebDriver driver, String expression) throws IOException{
		
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

	public static void inputValue(WebDriver driver, String path,String value) throws IOException{
		
		//return driver.findElement(By.xpath(ReadConfigureFile.readConfig().getProperty("//*a[@href='http://demoqa.com/registration/']")));	
		
		driver.findElement(By.xpath(path)).sendKeys(value);
		

}
	
	/**
	 * To select value from dropdown
	 * @param id
	 * @return
	 */

public static  Select selectDropDown(WebDriver driver, String paths,String text){
	
	Select element = new Select( driver.findElement(By.xpath(paths)));
	
	  element.selectByVisibleText(text);;
	  
	  return element;
	  
	  
}


public static void uploadFile(WebDriver driver , String id,String path) throws AWTException, InterruptedException{
	driver.findElement(By.id(id)).click();
	StringSelection selection = new StringSelection(path);
	
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

public static boolean getPageTitle(WebDriver driver, String expectedtitle) throws IOException{
	
	boolean compare=false;
	
	if (driver.getTitle().equals(expectedtitle))
	{
		compare =true;
	}
		return compare;
}

public void clickonSubmit(WebDriver driver, String Path){
	
	driver.findElement(By.xpath(Path)).click();
	
	
}
		
	

}
