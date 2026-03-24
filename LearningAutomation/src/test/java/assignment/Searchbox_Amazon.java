package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbox_Amazon {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Text : ");
        String text=sc.next();
        

        //Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Navigate To URL 
		driver.get("https://www.amazon.in/");
		
		//WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		WebElement searchbox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		searchbox.sendKeys(text);
		
		

	}

}
