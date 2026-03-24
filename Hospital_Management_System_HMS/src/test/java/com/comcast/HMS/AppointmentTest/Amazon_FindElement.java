package com.comcast.HMS.AppointmentTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_FindElement {
	@Test()
	public void Brands() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.submit();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::span[text()='See more']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='brandsRefinements']/descendant::ul[@id='filter-p_123']/descendant::span[@class='a-size-base a-color-base']"));
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		driver.findElement(By.xpath("//span[text()='Samsung']/ancestor::span[@class='a-list-item']/descendant::div")).click();
		
		driver.quit();
		
	}

}
