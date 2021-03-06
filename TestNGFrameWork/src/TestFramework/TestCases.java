package TestFramework;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases extends RegistrationPage  {

	
	@BeforeMethod
	
	public void launchBrowser() throws InterruptedException{
		
		LaunchBrowser.launchBrowser();
		Reporter.log("Browser Launched and URL opened");
		
		
	}
	@Test(priority =0, description ="Enter first NAME",groups ="smoke")
	public void tc001(){
		
		Assert.assertTrue(isFirstNameDisplayed());
		
		enterDataInFirstName();
		Reporter.log("Firstname entered");
		clickonSubmitButton();
		Reporter.log("clicked on submit button");
		
		
	}
	@Test(priority=1,description ="Enter Last NAME",groups ="smoke")
	public void tc002(){
		
		Assert.assertTrue(isLastNameDisplayed());
		
		enterDataInLastName();
		clickonSubmitButton();
		
		
	}
	/*
	@Test
	public void tc003() throws IOException, AWTException, InterruptedException{
		Assert.assertTrue(textDisplayed());
		SubmitRegistration();
		
		
	}*/
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException{
		
		if (ITestResult.FAILURE==result.getStatus()){
			
			File srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		FileUtils.copyFile(srcPath, new File("./Screenshot/screen.png"));
			
		}
	}
	
}
