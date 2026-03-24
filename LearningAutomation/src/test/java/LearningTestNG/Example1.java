package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 
{     
	@BeforeClass
	public void browsersetup()
	{
		Reporter.log("Browser Opened Sucess",true);
		Reporter.log("Navigation To Application Sucess",true);

		
	}
	@BeforeMethod()
	public void login()
	{
		Reporter.log("login Sucess",true);

	}
	
	@Test
	public void OrderProductBook()
	{
		Reporter.log("Book Product Order Sucess",true);

	}
	
	@Test
	public void OrderProductComputer()
	{
		Reporter.log("Computer Product Order Sucess",true);

	}
	@AfterMethod()
	public void logout()
	{
		Reporter.log("logout Sucess",true);

	}
	
	@AfterClass
	public void browserterminate()
	{
		Reporter.log("Browser Closed Sucess",true);

	}
	
	
	

}
