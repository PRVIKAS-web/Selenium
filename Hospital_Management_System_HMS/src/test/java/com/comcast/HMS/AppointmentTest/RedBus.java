package com.comcast.HMS.AppointmentTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RedBus {
	@Test()
	public void Bus() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		WebElement src = driver.findElement(By.xpath("//div[@class='inputAndSwapWrapper___15de7e']//input"));
		Actions actions = new Actions(driver);

		actions.moveToElement(src).click().sendKeys("kukatpally").build().perform();
		
		Thread.sleep(2000);
		
		WebElement dest = driver.findElement(By.xpath("//div[@class='srcDestWrapper___2e034d ']//input"));
		actions.moveToElement(dest).click().sendKeys("Banglore").build().perform();
		driver.findElement(By.id("search_button")).click();
		List<WebElement> names = driver
				.findElements(By.xpath("//div[@class='travelsName___3da91c'] | //p[@class='droppingTime___ac8c6a']"));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText());
		}
	}
}
