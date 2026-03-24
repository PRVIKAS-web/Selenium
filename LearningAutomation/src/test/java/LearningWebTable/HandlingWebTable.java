package LearningWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args)
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//fetch all City Names
		List<WebElement>allcity=driver.findElements(By.xpath("//th[text()='City']/../../../tbody/tr/td[3]"));
				
		//fetch the size
		int count=allcity.size();
		System.out.println("Number of cities::"+count);
		
		System.out.println("City names::");		
		//fetch text values
		for(int i=0;i<count;i++)
		{
			String text=allcity.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();
					

	}

}
