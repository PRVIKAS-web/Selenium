import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAmazon 
{

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();

	
		// Navigate To URL
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("samsung");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement>brandnames=driver.findElements(By.xpath("//div[@id='brandsRefinements']//descendant::span[@class='a-size-base a-color-base']"));
		for(int i=0;i<brandnames.size();i++)
		{
			System.out.println(brandnames.get(i).getText());
			if(brandnames.get(i).getText().contains("Samsung"))
			{
				brandnames.get(i).click();
				break;
			}
			
			
		}
	

	}

}
