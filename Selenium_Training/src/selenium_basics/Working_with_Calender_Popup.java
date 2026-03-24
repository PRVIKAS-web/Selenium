package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Calender_Popup
{

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      driver.get("https://www.redbus.in/");
	      
	      driver.findElement(By.xpath("//div[@class='dateWrapper___fed9d3 ']")).click();
	      
	      WebElement todaydate=driver.findElement(By.xpath("//span[text()='17']"));
	      
	      todaydate.click();
	      
	}

}
