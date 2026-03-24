  package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_with_Notificationpopup {

	public static void main(String[] args) 
	{
		
		 ChromeOptions options=new ChromeOptions();
		 
		 options.addArguments("--disable notifications");
		
		  ChromeDriver driver=new ChromeDriver(options);
		
	      driver.get("https://www.easemytrip.com/");
	       
	      driver.manage().window().maximize();

	}

}
