package AutomationSelenium;

import java.io.IOException;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
					
		CommonUtility.launchBrowser();
		CommonUtility.getPageTitle(ReadConfigureFile.readConfig().getProperty("ExpectedTitle"));
		
		Thread.sleep(3000);
		
		CommonUtility.getLinkSize("input").size();
		CommonUtility.closeWindow();
		}
	}


