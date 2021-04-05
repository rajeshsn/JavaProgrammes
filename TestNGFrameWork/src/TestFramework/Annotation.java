package TestFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	
	@AfterMethod
	public void afterTest()
	{
		System.out.println("After Test CAse");
	}
	
	@BeforeMethod
	
	public void beforeMethod(){
	
		System.out.println("Before Test");
		
	}
	
	@Test
	
	public void tc01(){
		
		System.out.println("TC01 executed");
		
	}
	
	}


