package learnwebdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowrelatedoperations {

	public static void main(String[] args) 
	{
		 // Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		
		
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        //driver.manage().window().minimize();
        
        driver.manage().window().fullscreen();
        
        Dimension size=driver.manage().window().getSize();
        
        System.out.println(size);
        
        Point position=driver.manage().window().getPosition();
        
        System.out.println(position);
        
        
        driver.manage().window().setSize(new Dimension(500,500));
        
        driver.manage().window().setPosition(new Point(200,200));

	}

}
