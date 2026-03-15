package com.comcast.HMS.AppointmentTest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links {
@Test()
public void links() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement link : links) {
		String url =link.getAttribute("href");
		if(url==null || url.isEmpty()) {
			System.out.println("We cant Check Url");
			continue;
		}
		try {
		URL u = new URL(url);
		HttpURLConnection href = (HttpURLConnection) u.openConnection();
		href.connect();
		if(href.getResponseCode()>=400) {
			System.out.println(url+"------------------"+href.getResponseCode()+"Is a Broken Link");
		}else {
			System.out.println(url+"================="+href.getResponseCode()+"Is not a Broken Link");
		}
		}
		catch(Exception E) {
			
		}
		
		
	}
	driver.quit();
	
}
}
