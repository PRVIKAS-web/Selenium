package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidation {

	public static void main(String[] args) {
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");

		// Identify Using Id Locator
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));

		// Validation searchbox
		if (searchbox.isDisplayed()) {
			System.out.println("searchbox Is Displayed");

		}
		else
		{
			System.out.println("searchbox Is Not Displayed");
		}
		if (searchbox.isEnabled()) {
			System.out.println("searchbox Is Enabled");

		}
		else
		{
			System.out.println("searchbox Is  Not Enabled");
		}

		// Enter Input Into The SearchBox
		searchbox.sendKeys("Computers");
		// clear
		searchbox.clear();

		searchbox.sendKeys("Books");

		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		// searchbutton validation
		if (searchButton.isDisplayed()) {
			System.out.println("SearchButton Is Displayed");
		}
		else
		{
			System.out.println("SearchButton Is Not Displayed");
			
		}
		boolean isEnabled=searchButton.isEnabled();
		System.out.println(isEnabled);
		if (isEnabled) {
			System.out.println("SearchButton IsEnabled");
		}
		else
		{
			System.out.println("SearchButton Is Not Enabled");
		}

		//searchButton.click();
		searchButton.submit();

	}

}
