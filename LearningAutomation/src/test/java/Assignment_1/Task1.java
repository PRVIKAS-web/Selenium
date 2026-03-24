package Assignment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// IMPLICITWAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");

		// Verify Page
		String act_url = driver.getCurrentUrl();
		String exp_title = "https://demowebshop.tricentis.com/";
		if (act_url.equals(exp_title)) 
		{
			System.out.println("url Is verified");

		} 
		else 
		{
			System.out.println("url is not verified");
		}
		
		//Identify Login link
		WebElement Login= driver.findElement(By.xpath("//a[text()='Log in']"));
		if (Login.isDisplayed())
		{
			System.out.println("login link is displayed");
		}
		else
		{
			System.out.println("Login link is  not displayed");
		}
        
		//click on login
		Login.click();
		
		//identify elements
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement Loginlink = driver.findElement(By.xpath("//input[@value='Log in']"));

		
		//verification of email,password,loginlink
		if (email.isDisplayed() && password.isDisplayed() && Loginlink.isDisplayed())
		{
			System.out.println("email,password,loginlink is displayed");
		}
		else
		{
			System.out.println("email,password,loginlink is displayed");
		}
		
		if (email.isEnabled() && password.isEnabled())
		{
			System.out.println("email,password is enabled");
		}
		else
		{
			System.out.println("email,password is not enabled");
		}
		
		//inputs
		email.sendKeys("vickypr1998@gmail.com");
		password.sendKeys("Vicky@12");
		Loginlink.click();
		
		//Identify searchbox
		WebElement searchbox=driver.findElement(By.id("small-searchterms"));
		
		//Enter Input Into The SearchBox
		searchbox.sendKeys("Book");
		
		//identify searchbutton
		WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Search']"));
		
		//click on searchbutton
		searchbutton.click();
		
		//identify healthbook link
		WebElement healthbook=driver.findElement(By.xpath("(//a[text()='Health Book'])[2]"));
		healthbook.click();
		
		//verification
		WebElement healthbooktext=driver.findElement(By.xpath("//div[contains(text(),'Worried about your health. Get the newest insights here!')]"));
		if (healthbooktext.isDisplayed())
		{
			System.out.println("healthbook link is displayed");
		}
		else
		{
			System.out.println("helathbook link is  not displayed");
		}
		
		//add to cart
		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-22']"));
		if (addtocart.isDisplayed())
		{
			System.out.println("addtocart button is displayed");
		}
		else
		{
			System.out.println("addtocart button is  not displayed");
		}
		
		//click on addtocart
		addtocart.click();
		
		//shoppingcart
		WebElement shoopingcart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		shoopingcart.click();
		
		//verification
		WebElement bookver=driver.findElement(By.xpath("(//a[text()='Health Book'])[2]"));
		if (bookver.isDisplayed())
		{
			System.out.println("book ver is displayed");
		}
		else
		{
			System.out.println("book ver  is  not displayed");
		}
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
		if (logout.isDisplayed())
		{
			System.out.println("logout is displayed");
		}
		else
		{
			System.out.println("logout  is  not displayed");
		}
      
		//click on logout
		logout.click();
		
		//Books Verification
		WebElement Books=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		if (Books.isDisplayed())
		{
			System.out.println("Books is displayed");
		}
		else
		{
			System.out.println("Books  is  not displayed");
		}
		
		//close the browser
		driver.close();
      

		
		

		
		

		
		
		
		
		

		
		
		

		
		

	}

}
