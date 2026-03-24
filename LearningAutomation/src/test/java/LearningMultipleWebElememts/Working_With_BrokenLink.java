package LearningMultipleWebElememts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_BrokenLink {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			
//		        String text=links.get(i).getText();
//				System.out.println(text+" ");
				String value=links.get(i).getAttribute("href");
				System.out.println(value);
				if(value==null||value.isEmpty())
				{
					System.out.println("we cant check");
					continue;
				}
				try
				{
				URL u=new URL(value);
				HttpURLConnection huc=(HttpURLConnection)u.openConnection();
				huc.connect();
				if(huc.getResponseCode()>=400)
				{
					System.out.println(value+" "+huc.getResponseCode()+" ------>is a broken link");
				}
				else
				{
					System.out.println(value+" "+huc.getResponseCode()+"-------> is not a broken link");
				}
				}
				catch(Exception e)
				{
					
				}
				

		}


	}

}
