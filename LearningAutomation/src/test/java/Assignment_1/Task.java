package Assignment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task
{

	public static void main(String[] args) 
	{
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//IMPLICITWAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");
		
		// Verify Page
		String act_url = driver.getCurrentUrl();
		String exp_title = "https://demowebshop.tricentis.com/";
		if (act_url.equals(exp_title)) 
		{
			System.out.println("url Is verified");

		} else
		{
			System.out.println("url is not verified");
		}
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		if (register.isDisplayed() && register.isEnabled()) 
		{
			System.out.println("register Is Displayed and Enabled");

		} 
		else 
		{
			System.out.println("register Is not  Displayed and Enabled");
		}
		
		//click on register
		register.click();
		
		//identify the elements
		WebElement maleradio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement confirmpassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement registerbutton= driver.findElement(By.xpath("//input[@id='register-button']"));

		
		
		
		//verification
		if (maleradio.isDisplayed() && firstname.isDisplayed() && lastname.isDisplayed() && email.isDisplayed() && password.isDisplayed() && confirmpassword.isDisplayed() &&registerbutton.isDisplayed()) {
			System.out.println("maleradio,firstname,lastname,email,password,confirmpassword,registerbutton Is Displayed");

		} else {
			System.out.println("maleradio,firstname,lastname,email,password,confirmpassword,registerbutton  Is Not Displayed");
		}
		if (maleradio.isEnabled() && firstname.isEnabled() && lastname.isEnabled() && email.isEnabled() && password.isEnabled() && confirmpassword.isEnabled()) {
			System.out.println("maleradio,firstname,lastname,email,password,confirmpassword Is Enabled");

		} else {
			System.out.println("maleradio,firstname,lastname,email,password,confirmpassword Is  Not Enabled");
		}
		
		//inputs
		maleradio.click();
		firstname.sendKeys("Vikas");
		lastname.sendKeys("PR");
		email.sendKeys("vickypr2025@gmail.com");
		password.sendKeys("Vicky@12");
		confirmpassword.sendKeys("Vicky@12");
		registerbutton.click();
		
		//registration verification
		WebElement registermessage= driver.findElement(By.xpath("//div[contains(text(),' Your registration completed')]"));
		if (registermessage.isDisplayed())
		{
			System.out.println("registermessage is displayed");
		}
		else
		{
			System.out.println("registermessage is  not displayed");
		}
		
		
		//close the browser
		driver.close();
		
		


		

		
		
			
		

	
		

	}
}


