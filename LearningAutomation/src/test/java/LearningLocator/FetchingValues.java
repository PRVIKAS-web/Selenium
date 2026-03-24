package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingValues {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Welcometostore= driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		
		//fetching Values
		String text=Welcometostore.getText();
		System.out.println("text:: "+text);
		
		String tagname=Welcometostore.getTagName();
		System.out.println("tagname:: "+tagname);
		
		String attribute=Welcometostore.getAttribute("class");
		System.out.println("attribute:: "+attribute);
		
		String cssvalue=Welcometostore.getCssValue("color");
		System.out.println("cssvalue:: "+cssvalue);
		
		String Expected_text="Welcome to our store";
		String Actual_text=Welcometostore.getText();
		if(Expected_text.equals(Actual_text))
		{
			System.out.println("Text Verification is Passesd");
		}
		else
		{
			System.out.println("Text Verification is Failed");	
			
		}
		
		int expsize_width=510;
		int actsize_width=Welcometostore.getSize().getWidth();
		//System.out.println(actsize_width);
		if(expsize_width==actsize_width)
		{
			System.out.println("Size width verification is Passes");
		}
		else
		{
			System.out.println("Size  width verification is Failed");
		}
		
		int expsize_height=17;
		int actsize_height=Welcometostore.getSize().getHeight();
		//System.out.println(actsize_height);
		if(expsize_height==actsize_height)
		{
			System.out.println("height verification is Passes");
		}
		else
		{
			System.out.println("height verification is Failed");
		}
		
		
		
		int expect_xcoor=377;
		int actual_xcoor=Welcometostore.getLocation().getX();
		//System.out.println(actual_xcoor);
		if(expect_xcoor==actual_xcoor)
		{
			System.out.println("x coordinate verification is Passes");
		}
		else
		{
			System.out.println("x coordinate verification is Failed");
		}
		
		int expect_ycoor=597;
		int actual_ycoor=Welcometostore.getLocation().getY();
		System.out.println(actual_ycoor);
		if(expect_ycoor==actual_ycoor)
		{
			System.out.println("y coordinate verification is Passes");
		}
		else
		{
			System.out.println("y coordinate verification is Failed");
		}
		
		
 
		
		
		
		
		

	}

}
