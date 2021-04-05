package TestFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases1 {
	
	@Test(retryAnalyzer =RetryTestExecute.class)
	
	public void TC001(){
		
		Assert.assertTrue(false);
	}

}
