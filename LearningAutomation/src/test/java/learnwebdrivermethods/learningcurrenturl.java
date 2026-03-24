package learnwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningcurrenturl 
{
	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		String expurl="https://www.facebook.com/";
		
        driver.get("https://www.facebook.com/");
		
        String actualurl=driver.getCurrentUrl();
        
		System.out.println("url: "+actualurl);
		
		if(actualurl.equals(expurl))
		{
			System.out.println("URL verified pass");

		}
		else
		{
			System.out.println("URL verified fail");

		}
		
		driver.close();
		
		
	}

}
