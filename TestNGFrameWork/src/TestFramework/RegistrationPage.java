package TestFramework;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class RegistrationPage extends WrapperMethod {
	
	
	static WebDriver driver;
	
	public boolean isFirstNameDisplayed(){
		
		return checkElementExists(driver, "name_3_firstname");
		
		
	}
	public boolean isLastNameDisplayed(){
		
		return checkElementExists(driver, "name_3_lastname");
		
		
	}

	public void enterDataInFirstName(){
		
		enterDataInTextField(driver, "name_3_firstname", "Rajesh");
	}
	
public void enterDataInLastName(){
		
		enterDataInTextField(driver, "name_3_lastname", "Negi");
	}

public void clickonSubmitButton(){
	
	clickonSubmit(driver,"//input[@name='pie_submit']");
}

public void SubmitRegistration() throws IOException, AWTException, InterruptedException{
	inputValue(driver, "//input[@id='name_3_firstname']","Rajesh");
	inputValue(driver, "//input[@id='name_3_lastname']","Negi");
	clickOnElement(driver,"input[value='single']");
	clickOnElement(driver,"input[value='cricket']");
	selectDropDown(driver, "//select[@id='dropdown_7']","India");
	selectDropDown(driver, "//select[@id='mm_date_8']","8");
	selectDropDown(driver, "//select[@id='dd_date_8']","12");
	selectDropDown(driver, "//select[@id='yy_date_8']","1988");
	inputValue(driver, "//*[@id='phone_9']","7263871558");
	inputValue(driver, "//*[@id='username']","LifeisGood");
	inputValue(driver, "//*[@id='email_1']","rajeshcool.negi@gmail.com");
	uploadFile(driver, "profile_pic_10", "C:\\Users\\Rajesh\\Desktop\\Rajesh Negi_CV (Automation Testing)");
	inputValue(driver, "//*[@id='email_1']","Cool,Hardworking,Passionate,Kind,Helpful..etc..etc..");
	inputValue(driver, "//*[@id='password_2']","Norwich");
	inputValue(driver, "//*[@id='confirm_password_password_2']","Norwich");
	clickOnElement(driver,"input[name='pie_submit']");
}	

public boolean textDisplayed() throws IOException{
	
	return getPageTitle(driver, "Registration | Demoqa");
}

}
