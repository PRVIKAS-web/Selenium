package InterviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchtoParticularwindow 
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		// Launch The Browser
	    driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//javascriptexecutor to perform scrolling actions
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//linkedIn
		WebElement linkedin=driver.findElement(By.xpath("(//*[name()='svg'and @role='presentation'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",linkedin);
		linkedin.click();
		
		//faceBook
		WebElement facebook = driver.findElement(By.xpath("(//*[name()='svg'and @role='presentation'])[2]"));
		facebook.click();
		
		//twitter
		WebElement twitter = driver.findElement(By.xpath("(//*[name()='svg'and @role='presentation'])[3]"));
		twitter.click();
		
		//youTube
		WebElement youtube = driver.findElement(By.xpath("(//*[name()='svg'and @role='presentation'])[4]"));
		youtube.click();
		
		//To handle multiple windows
		Set<String> handles=driver.getWindowHandles();
		
		//To maintain insertion order
		List<String> hList=new ArrayList<String>(handles);
		
		if(switchToRightWindow("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook",hList))
		{
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		}
	}
		
        public static boolean switchToRightWindow(String windowTitle,List<String> hList)
		{
			for(String e:hList)
			{
				String title=driver.switchTo().window(e).getTitle();
				if(title.contains(windowTitle))
				{
					System.out.println("found the right window.....");
					return true;
				}
			}
			return false;
		}
	
		





	

}
