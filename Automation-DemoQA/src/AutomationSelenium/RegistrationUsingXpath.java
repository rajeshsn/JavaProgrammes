package AutomationSelenium;

import java.io.IOException;

public class RegistrationUsingXpath {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		CommonUtility.launchBrowser();
		
		CommonUtility.clickOnElement("a[href='http://demoqa.com/registration/']");
		CommonUtility.inputValue("//input[@id='name_3_firstname']", "Rajesh Singh");
		CommonUtility.inputValue("//input[@id='name_3_lastname']", "Negi");
		CommonUtility.clickOnElement("input[value='single']");
		CommonUtility.clickOnElement("input[value='cricket ']");
		CommonUtility.selectDropDown("//select[@id='dropdown_7']", "India");
		CommonUtility.selectDropDown("//*[@id='mm_date_8']", "8");
		CommonUtility.selectDropDown("//*[@id='dd_date_8']", "12");
		CommonUtility.selectDropDown("//*[@id='dd_date_8']", "12");
		CommonUtility.selectDropDown("//*[@id='yy_date_8']", "1988");
		CommonUtility.inputValue("//*[@id='phone_9']", "7263871558");
		CommonUtility.inputValue("//*[@id='username']", "rajeshnegi1988");
		CommonUtility.inputValue("//*[@id='email_1']", "rajesh_negi75@yahoo.com");
		
	CommonUtility.uploadFile("//*[@id='profile_pic_10']", "C:\\Users\\Rajesh\\Desktop\\Documents\\Photo.jpg");
	
	CommonUtility.inputValue("//*[@id='description']", "Cool,Hardworking,Passionate,Kind,Helpful..etc..etc..");
	
	CommonUtility.inputValue("//*[@id='password_2']", "Lifeisgood");
	
	CommonUtility.inputValue("	//*[@id='confirm_password_password_2']", "Lifeisgood");
	
	CommonUtility.clickOnElement("//*[@id='pie_register']/li[14]/div/input");
	
	CommonUtility.driver.quit();
		
	
	
	
	}

}
