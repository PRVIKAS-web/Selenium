package genericlibrary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Pagerepository.WelcomePage;

public class BaseConfiguration
{
	Logger logobj=LogManager.getLogger(BaseConfiguration.class);
	
	
	@DataProvider
	public Object[][] searchData()
	{
		Object[][] data=new Object[3][1];
		data[0][0]="Book";
		data[1][0]="Computer";
		data[2][0]="Desktop";
		return data;
		
	}
	
	
	
	public WebDriver driver;
	public static WebDriver stdriver;
	
	
	@Parameters({"BrowserName","AuthorName"})
	@BeforeClass
	public void browsersetup(String BrowserName,String AuthorName)
	{
		
		if(BrowserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			stdriver=driver;
		}
		else if(BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
			stdriver=driver;
		}
		else if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			stdriver=driver;
		}
		else {
			Reporter.log("invalid Browser",true);
		}
		driver.get("https://demowebshop.tricentis.com/");
		logobj.info(BrowserName+" Browser Opened Sucess", true);
		logobj.info("Name of Author: "+AuthorName,true);
		logobj.info("Navigation To Application Sucess", true);
		String expected_url="https://demowebshop.tricentis.com/";
		String actual_url=stdriver.getCurrentUrl();
		Assert.assertEquals(actual_url,expected_url);

	}

	

	@BeforeMethod()
	public void login() {
		
		/*WebElement Login= driver.findElement(By.xpath("//a[text()='Log in']"));
		Login.click();
		//identify elements
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement Loginlink = driver.findElement(By.xpath("//input[@value='Log in']"));
		//inputs
		email.sendKeys("vickypr1998@gmail.com");
		password.sendKeys("Vicky@12");
		Reporter.log("login Sucess", true);
		Loginlink.click();*/
		
		WelcomePage welcomeobj=new WelcomePage(driver);
		welcomeobj.getLoginlink().click();
		welcomeobj.getEmail().sendKeys("vickypr1998@gmail.com");
		welcomeobj.getPassword().sendKeys("Vicky@12");
		welcomeobj.getLoginBtn().click();
		logobj.info("Login sucess");
		


		

	}

	@AfterMethod()
	public void logout() {
		
		WelcomePage welcomeobj=new WelcomePage(driver);
		welcomeobj.getLoginout().click();
		logobj.info("logout Sucess", true);

		

	}

	@AfterClass
	public void browserterminate() {
		
		driver.close();
		logobj.info("Browser Closed Sucess", true);
		

	}
	
	
	
	

}
