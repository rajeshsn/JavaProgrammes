package Day1;

import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.servlet.FilterRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBroweser {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.get("https://demo.guru99.com/test/newtours/");
String expectedTitle = "Welcome: Mercury Tours";

String actualTitle= driver.getTitle();

if (expectedTitle.contentEquals(actualTitle))
	
{
	System.out.println("Test passed");
	}else
		
		System.out.println("Test Failed");

driver.findElement(By.linkText("REGISTER")).click();

driver.findElement(By.name("firstName")).sendKeys("Rajesh");
driver.findElement(By.name("lastName")).sendKeys("Negi");
driver.findElement(By.name("phone")).sendKeys("7263871558");
driver.findElement(By.name("userName")).sendKeys("rajesh_negi75@yahoo.com");
driver.findElement(By.name("address1")).sendKeys("H-133");
driver.findElement(By.name("city")).sendKeys("Ranikhet");
driver.findElement(By.name("state")).sendKeys("Uttrakhand");
Select country =new Select(driver.findElement(By.name("country")));
country.selectByVisibleText("INDIA");
driver.findElement(By.name("email")).sendKeys("rajeshnegi1988");
driver.findElement(By.name("password")).sendKeys("Norwich");
driver.findElement(By.name("confirmPassword")).sendKeys("Norwich");
driver.findElement(By.name("submit")).click();

	}

	
}