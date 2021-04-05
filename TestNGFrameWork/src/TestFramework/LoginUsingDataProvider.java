package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProvider {
	
	@DataProvider(name ="logindata")
	public Object[][] credManager(){
		return new Object[][]{{"testuser1","password1"}};
	}
	
	@DataProvider(name ="logindata1")
	public Object[][] credManager1(){
		return new Object[][]{{"testuser2","password2"}};
	}
	@Test(dataProvider="logindata")
	public void loginTest(String sUserName,String sPassword) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/SignIn.html");
	    driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(sUserName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(sPassword);
		driver.findElement(By.xpath("//img[@id='enterbtn']")).click();
	}

}
