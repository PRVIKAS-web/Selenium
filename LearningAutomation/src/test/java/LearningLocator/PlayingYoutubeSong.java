package LearningLocator;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayingYoutubeSong {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Favorite Song : ");
        String song=sc.next();
        

        //Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate To URL 
		driver.get("https://www.youtube.com/");
		
		//searchbox
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='search_query']"));
		
		searchbox.sendKeys(song,Keys.ENTER);
		
		//Identify the first video
		WebElement firstVideo=driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
		firstVideo.click();


	}

}
