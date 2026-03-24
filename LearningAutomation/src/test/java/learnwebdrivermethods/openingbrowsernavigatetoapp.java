package learnwebdrivermethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingbrowsernavigatetoapp {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url:::");
		String url=sc.next();
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get(url);
		
		//closing the browser
		driver.close();
		driver.quit();

	}

}
