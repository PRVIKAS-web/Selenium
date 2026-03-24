package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args)
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("https://automationexercise.com/");
		
		// Verify Page
				String act_url = driver.getCurrentUrl();
				String exp_title = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				if (act_url.equals(exp_title)) {
					System.out.println("url Is verified");

				} else {
					System.out.println("url is not verified");
				}


	}

}
