package IdealLabsAssignment;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable
{
	
	public static void main(String[] args)
	{
		//Taking Dynamic Input
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Dynamic Data:: ");
			
				int n=sc.nextInt();
				
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("https://vinothqaacademy.com/webTable/");
		
		
		
		//fetch all  Names
				List<WebElement> allnames=driver.findElements(By.xpath("//th[text()='Name']/../../../tbody/tr/td["+n+"]"));
						
				//fetch the size
				int count=allnames.size();
				System.out.println("Number of names::"+count);
				
				System.out.println(" names::");		
				//fetch text values
				for(int i=0;i<count;i++)
				{
					String text=allnames.get(i).getText();
					System.out.println(text);
				}
				
				driver.close();
							

		
		List<WebElement> allDetails=driver.findElements(By.xpath("//table[2]//tbody//tr"));
		
		        //fetch the size
				int count1=allDetails.size();
				System.out.println("Number of rows::"+count1);
						
				System.out.println("All Details::");		
				//fetch text values
				for(int i=0;i<count1;i++)
				{
					String text=allDetails.get(i).getText();
					System.out.println(text+" ");
				}
				
				driver.close();

	}

}
