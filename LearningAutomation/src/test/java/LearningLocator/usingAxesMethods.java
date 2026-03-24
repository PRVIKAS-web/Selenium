package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingAxesMethods 
{

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");

		// Identify Using Id Locator
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));

		// Enter Input Into The SearchBox
		searchbox.sendKeys("Book");
		
		//click on searchbutton
		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
		
		//Using Following
		WebElement actualprice = driver.findElement(By.xpath("//a[text()='Health Book']/following::span[1]"));
		String actualprice_text=actualprice.getText();
		System.out.println("ActualPrice:: "+actualprice_text);
		
		
		WebElement discountprice = driver.findElement(By.xpath("//a[text()='Health Book']/following::span[2]"));
		String discountprice_text=discountprice.getText();
		System.out.println("DiscountPrice:: "+discountprice_text);
		
		//Using Preceding
		WebElement productname = driver.findElement(By.xpath("//input[@type='button']/preceding::a[text()='Health Book']"));
		String productname_text=productname.getText();
		System.out.println("productname:: "+productname_text);
		
				

		
		

	}

}
