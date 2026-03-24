package learnwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learninggetpagesource {

	public static void main(String[] args) 
	{
		        // Launch The Browser
				WebDriver driver = new ChromeDriver();
				
				
				
		        driver.get("https://www.facebook.com/");
				
		        String actualurl=driver.getCurrentUrl();
		        
				System.out.println("url: "+actualurl);
				
				
				String pagesource=driver.getPageSource();
				
				System.out.println("pagesource: "+pagesource);
				
				String title=driver.getTitle();
				
				System.out.println("title: "+title);

				
				
				
				driver.close();
				

	}

}
