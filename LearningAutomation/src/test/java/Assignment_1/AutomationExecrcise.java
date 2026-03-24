package Assignment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationExecrcise
{
	WebDriver driver;
	@Test
	public void addtocart()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement email=driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		email.clear();
		email.sendKeys("vic@1998");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("Vicky@12");
		
		WebElement loginbtn=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		loginbtn.click();
		
		WebElement addtocart=driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));

      addtocart.click();
		
	}

}
