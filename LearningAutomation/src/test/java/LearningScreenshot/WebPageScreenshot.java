package LearningScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenshot {

	public static void main(String[] args)
	{
		       // Launch The Browser
				WebDriver driver = new ChromeDriver();

				// Maximize The Window
				driver.manage().window().maximize();
				
				Random r= new Random();
				int r1 = r.nextInt(1000);
				int r2=r1;
				

				// Navigate To URL
				driver.get("https://demowebshop.tricentis.com/");
				
				//Typecasting from Webdriver to takescreenshot
				TakesScreenshot ts=(TakesScreenshot)driver;
				
				//create temporary path
				File tempath=ts.getScreenshotAs(OutputType.FILE);
				
				//create permanent path
				File perpath=new File("./TestScreenshot/screenshot"+r2+".png");
				
				//handling IO exception 
				try 
				{
					FileHandler.copy(tempath, perpath);
				} 
				catch (IOException e) 
				{
					
					e.printStackTrace();
				}
				
				System.out.println("Screenshot capture sucessfully");
				driver.close();
				
				
	}

}
