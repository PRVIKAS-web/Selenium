package com.comcast.HMS.AppointmentTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_TableTest {
	
		@Test()
		public void webTableTest() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			List<WebElement> rows = driver.findElements(By.xpath("(//tr[@class='bg-white border-b  hover:bg-orange-100']/child::td)[position() mod 2 = 0]"));
			for (int i=0; i<rows.size(); i++) {
				
				String ele = rows.get(i).getText();
				System.out.println(ele);
				}
//            	for(WebElement row: rows) {
//            		String ele = row.getText();
//					System.out.println(ele);
//            	}
//			Iterator<WebElement> itr = rows.iterator();
//			while(itr.hasNext()) {
//				String ele = itr.next().getText();
//				System.out.println(ele);
//			}
			 driver.quit();
			
		}
	

}
