package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_BrowserMethods {

	public static void main(String[] args) 
	{
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Navigate to url
		driver.get("https://www.google.com/");
		
		//To Print the Title of the URL
		String title=driver.getTitle();
		System.out.println(title);
		
		//To Print the currenturl of the URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//To Print the currenturl of the URL
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		//close the browser
		//driver.close();
		//driver.quit();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize(); 
		
		
		
		
		
		

	}

}
