package LearningJavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		//Typecasting 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Navigate To URL
		js.executeScript("window.location=arguments[0]","https://automationexercise.com/");
		
		//verify the page
		System.out.println(js.executeScript("return document.title"));
		
		//click on signup/login link 
		WebElement signup = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		js.executeScript("arguments[0].click()",signup);
		
		//verify the page
		System.out.println(js.executeScript("return document.URL"));
		
		//Reload the page
		System.out.println(js.executeScript("history.go(0)"));
		
		//identify the name
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		js.executeScript("arguments[0].value='Vikas';",name);
		
		//identify the email
		WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
		js.executeScript("arguments[0].value='vic@1998';",email);
		
		//click on signup
		WebElement signupbutton = driver.findElement(By.xpath("//button[text()='Signup']"));
		js.executeScript("arguments[0].click()",signupbutton);
		
		//verify the page
		System.out.println(js.executeScript("return document.Title"));
		
		//scrolling
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		js.executeScript("arguments[0].scrollIntoView(true)",firstname);
		js.executeScript("arguments[0].value='vikasPR';",firstname);

		
		//close the browser
		driver.close();

		
		
		
		

		
		

		
		

		

		
		

		
		

		

		

		
		
		
		

	}

}
