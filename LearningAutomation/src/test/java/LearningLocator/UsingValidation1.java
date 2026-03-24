package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidation1 {

	public static void main(String[] args) {
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");

		// Identify Using Id Locator
		WebElement RadioButton= driver.findElement(By.xpath("//input[@id='pollanswers-1']"));

		// Validation 
		if (RadioButton.isDisplayed()) {
			System.out.println(" RadioButton Is Displayed");

		} else {
			System.out.println("RadioButton Is Not Displayed");
		}
		if (RadioButton.isEnabled()) {
			System.out.println("RadioButton Is Enabled");

		} else {
			System.out.println("RadioButton Is  Not Enabled");
		}
		RadioButton.click();
		if (RadioButton.isSelected()) {
			System.out.println("RadioButton Is Selected");

		} else {
			System.out.println("RadioButton Is  Not Selected");
		}
		
		
		

		

		

	}

}
