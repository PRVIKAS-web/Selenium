package learnwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplesforWebdrivermethods {

	public static void main(String[] args) {
		// task1
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		//navigating to the application
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedtitle="https://demowebshop.tricentis.com/";
		
		String actualtitle=driver.getTitle();
		
		System.out.println("Title: "+actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title verified pass");

		}
		else
		{
			System.out.println("Title verified fail");

		}
		
		//task2
		driver.get("https://www.facebook.com/");
		
        String url=driver.getCurrentUrl();
        
		System.out.println("url: "+url);
		

		//task3
        driver.get("https://www.selenium.dev/");
		
        String pagesource=driver.getPageSource();
        
		System.out.println("pagesource: "+pagesource);
		
		
		//closethe browser
		driver.close();
		
		

	}

}
