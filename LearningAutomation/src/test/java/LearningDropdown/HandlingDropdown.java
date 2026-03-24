package LearningDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	public static void main(String[] args) throws InterruptedException 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		// Navigate To URL
		driver.get("https://www.amazon.in/");
		
		//identify dropdown
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(dropdown);
       
		//checking single or multiple dropdown
		if(select.isMultiple())
		{
			System.out.println("Multi dropdown");
			
		}
		else
		{
			System.out.println("single dropdown");

		}
		
		//selecting options using different methods
		select.selectByIndex(1);
		select.selectByValue("search-alias=fashion");
		//select.selectByVisibleText("Amazon Fresh");
		
		List<WebElement>alloptions=select.getOptions();
		int count=alloptions.size();
		for(int  i=0;i<count;i++)
		{
			String text=alloptions.get(i).getText();
			System.out.println(i+" "+text);
		}
		
		//file:///C:/Users/VRCR/Downloads/EmbededWebpage.html

		
		

	}

}
