package com.comcast.HMS.AppointmentTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Zomato {
@Test()
public void restaurant() throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.zomato.com/hyderabad/delivery");
	WebElement element = driver.findElement(By.xpath("//p[text()='Explore options near me']"));
	List<WebElement> restaurant;
	for(;;) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
		Thread.sleep(3000);
		restaurant = driver.findElements(By.xpath("//h4[@class='sc-1hp8d8a-0 sc-iqtXtF ndScH']"));
		try {
			driver.findElement(By.xpath("//h3[text()='End of search results']"));
		}
		catch(Exception e) {
		}
		break;
	}
	for (WebElement res : restaurant) {

        String name = res.getText();
        System.out.println(name);
	}
	driver.quit();
}
}
