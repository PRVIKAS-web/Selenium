package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
		
		//driver.get("file:///C:/Users/VRCR/OneDrive/Desktop/loginpage.html");
		
		//driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("/html//body/input[1]")).sendKeys("vikas");
		
		//driver.findElement(By.xpath("/html//body/input[2]")).sendKeys("vikas@12 ");


        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        //driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        
        driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
          
        driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();


	}

}
