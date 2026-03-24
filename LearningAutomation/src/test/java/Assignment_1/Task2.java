package Assignment_1;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import HandlingDataDrivenTesting.HandlingExcelFile;
import HandlingDataDrivenTesting.HandlingPropertiesfile;
import Pagerepository.WelcomePage;

public class Task2
{
	public static WebDriver stdriver;
	 
	@Test(enabled=true)
	public void DemoWebshop() throws IOException
	{
		
		        //properties file
		        HandlingPropertiesfile Hpf=new HandlingPropertiesfile();
		        
		        //Handling Excel file
		        HandlingExcelFile hs=new HandlingExcelFile();
		        
		       
		        
		
		        // Launch The Browser
				WebDriver driver = new ChromeDriver();

				// Maximize The Window
				driver.manage().window().maximize();

				// IMPLICITWAIT
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Navigate To URL

				//Navigate To URL using propertyfile
				driver.get(Hpf.readData("weburl"));
				
				
				
				//verification using Assertion
				String act_url = driver.getCurrentUrl();
				String exp_url= "https://demowebshop.tricentis.com/";
				Assert.assertEquals(act_url, exp_url);
				
				
				
				//Identify searchbox
				WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
				
				String searchText = hs.readData("RegisterData", 1, 6);
				System.out.println("Excel Data = " + searchText);

				// Enter data into search box
				searchbox.sendKeys(searchText);
				
				
				
				//identify searchbutton
				WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Search']"));
				
				//click on searchbutton
				searchbutton.click();
				
				//identify all products
				List<WebElement> productNames = driver.findElements(By.xpath("//h2[@class='product-title']/a"));

				//identify all product prices
				List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class='prices']//span"));

				System.out.println("Product Names and Prices");

				for (int i = 0; i < productNames.size(); i++) 
				{
				    String name = productNames.get(i).getText();
				    String price = productPrices.get(i).getText();
				    System.out.println(name + " --> " + price);
				}
                


				
				
	}

	
	
	

}
