package LearningWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllDetails {

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
		List<WebElement>allDetails=driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody[1]//tr"));
		
		//fetch the size
		int count=allDetails.size();
		System.out.println("Number of rows::"+count);
				
		System.out.println("All Details::");		
		//fetch text values
		for(int i=0;i<count;i++)
		{
			String text=allDetails.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();

	}

}
