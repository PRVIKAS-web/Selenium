package LearninIFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("file:///C:/Users/VRCR/OneDrive/Desktop/EmbededWebpage.html");
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"))	;	
		name.clear();
		name.sendKeys("Vicky");
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@name='frame1']"));
		driver.switchTo().frame(frame1);
		
		//switch to frame1
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Book");
		
		//switch to main page
		driver.switchTo().defaultContent();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vickypr1998");
		
		driver.switchTo().frame(1);
		
		WebElement searchbox1=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox1.sendKeys("Book");
		



	}

}
