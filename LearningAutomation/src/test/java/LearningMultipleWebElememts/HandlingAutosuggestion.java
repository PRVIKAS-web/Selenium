package LearningMultipleWebElememts;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAutosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		//Taking Dynamic Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dynamic Data:: ");
		String data=sc.next();
		int n=sc.nextInt();
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();

		Thread.sleep(9000);
		
		// Navigate To URL
		driver.get("https://www.amazon.in/");
		
		//Search Using Actions Class
		//Actions act=new Actions(driver);
		// act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,data).perform();
		
		WebElement searchbtn=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchbtn.sendKeys(data);
		
		//Dynamic Xpath
		String actualxpath="//div[contains(text(),'shoes')]";
		String dynamicxpath="//div[contains(text(),'"+data+"')]";
		
		//fetch all suggestions
		List<WebElement>allsuggestion=driver.findElements(By.xpath(dynamicxpath));
		
		//fetch the size
		int count=allsuggestion.size();
		System.out.println(count);
		
		//fetch text values
		for(int i=0;i<count;i++)
		{
			String text=allsuggestion.get(i).getText();
			System.out.println(text);
			
			/*//click nth
			if(text.equals("tshirts shirts for men with pocket")) 
			{
		        allsuggestion.get(i).click();
		        break;
			}*/
			
			if(count==n)
			{
				allsuggestion.get(i).click();
				String text1=allsuggestion.get(i).getText();
				System.out.println(text1);
				
				
			}
			
			
			
		} 
		driver.close();
		
		

	}

}
