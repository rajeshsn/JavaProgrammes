package AutomationSelenium;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationUsingCss {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
      CommonUtility.launchBrowser();

CommonUtility.driver.findElement(By.cssSelector("a[href='http://demoqa.com/registration/']")).click();
 CommonUtility.driver.findElement(By.cssSelector("input[id='name_3_firstname']")).sendKeys("Rajesh");
 CommonUtility.driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Singh");

	

	}

}
