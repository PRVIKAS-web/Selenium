package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locators {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("vikas");
		
		driver.findElement(By.name("LastName")).sendKeys("PR");
		
		driver.findElement(By.name("Email")).sendKeys("vikas90121998@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("vikas90121998");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("vikas90121998");
		
		driver.findElement(By.name("register-button")).click();
		
		driver.close();
		
		 //css selector
         //WebElement searchbox=driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		
		 //searchbox.sendKeys("mobiles");
		
		
		
		
		
		
		
		
		
		/*WebElement searchbox=driver.findElement(By.name("q"));
		
		//searchbox.sendKeys("mobiles");
		
        //WebElement searchbox=driver.findElement(By.id("small-searchterms"));
		
		//searchbox.sendKeys("mobiles");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.findElement(By.tagName("input")).sendKeys("test@123.com");
		
		driver.findElement(By.className("search-box-text")).sendKeys("mobiles");*/
		

	}

}
