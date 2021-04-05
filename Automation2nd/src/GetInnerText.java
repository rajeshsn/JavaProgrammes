import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class GetInnerText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='pie_submit']")).click();
		
		Thread.sleep(3000);
		
	String errorMessage=driver.findElement(By.xpath("//span[contains(text(),'* This field is required')][1]")).getText();
	
	
	System.out.println(errorMessage);
	
	//boolean flag =false;
	
	if (errorMessage.equals("* This field is required"))
	{
		
		System.out.println("Expected message is being displayed");
	}
	else
		System.out.println("Not Matched");
	
	
List<WebElement> al =driver.findElements(By.tagName("a"));



System.out.println("List Size is :"+al.size());


Iterator<WebElement> itr= al.iterator();

while(itr.hasNext())
	
{
	
System.out.println(itr.next().getText());

}

for(int i=0;i<al.size();i++){

if(al.get(i).getText().equals("Tootip"))

{
	System.out.println("Expected value is present");
	al.get(i).click();
	break;
	}


}

List<String> al2 = new ArrayList<String>();

for(int i=0;i<al.size()-1;i++){

al2.add(al.get(i).getText());
}

System.out.println(al2);




}
		

}
