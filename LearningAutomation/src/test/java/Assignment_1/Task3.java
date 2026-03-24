package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) 
	{
		        //Launch The Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize The Window
				driver.manage().window().maximize();
				
				//Navigate To URL
				driver.get("https://demowebshop.tricentis.com/");
				//Identify the register
				WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));			//click on register
				register.click();
				
				//identify the elements
				WebElement maleradio = driver.findElement(By.cssSelector("input[id='gender-male']"));
				WebElement firstname = driver.findElement(By.cssSelector("#FirstName"));
				WebElement lastname = driver.findElement(By.cssSelector("#LastName"));
				WebElement email = driver.findElement(By.cssSelector("#Email"));
				WebElement password = driver.findElement(By.cssSelector("#Password"));
				WebElement confirmpassword= driver.findElement(By.cssSelector("#ConfirmPassword"));
				WebElement registerbutton= driver.findElement(By.cssSelector("#register-button"));
				
				
				//inputs into the elements
				maleradio.click();
				firstname.sendKeys("Vikas");
				lastname.sendKeys("PR");
				email.sendKeys("vickypr2013@gmail.com");
				password.sendKeys("Vicky@12");
				confirmpassword.sendKeys("Vicky@12");
				registerbutton.click();
				

	}

}
