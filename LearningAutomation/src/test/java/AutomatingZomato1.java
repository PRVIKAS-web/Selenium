import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingZomato1 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();

	
		// Navigate To URL
		driver.get("https://www.zomato.com/hyderabad/restaurants");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		List<WebElement>resnames;
		WebElement scroll=driver.findElement(By.xpath("//p[text()='Explore options near me']"));
		//List<WebElement>resnames=driver.findElements(By.xpath("//div[@class='sc-ekQYnd jEGIEZ']//descendant::h4[@class='sc-1hp8d8a-0 sc-Ehqfj bxOQva']"));
		//System.out.println(resnames.size());
		for(;;)
		{
			
			js.executeScript("arguments[0].scrollIntoView(false);",scroll);
			Thread.sleep(3000);
			
			resnames=driver.findElements(By.xpath("//div[@class='sc-ekQYnd jEGIEZ']//descendant::h4[@class='sc-1hp8d8a-0 sc-Ehqfj bxOQva']"));
			break;
		}
		for (WebElement webElement : resnames) {
			
		}
		
	}
	
		


}


