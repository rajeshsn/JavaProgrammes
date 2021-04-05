package AutomationSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadConfigureFile {

	public static Properties readConfig() throws IOException {
		
      
    	  File file = new File("C:\\Java_Learning\\Automation-DemoQA\\config.properties");
    	  
    	  FileInputStream fs = new FileInputStream(file);
    	  
    	  Properties prop = new Properties();
    	  
    	  prop.load(fs);
    	  
    	  return prop;
      }
	}


