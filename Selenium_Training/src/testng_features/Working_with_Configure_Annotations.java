package testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_with_Configure_Annotations
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Executing before suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Executing before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Executing before class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Executing before method");
	}
	
	
	
	
	@Test
	public void TC1()
	{
		System.out.println("Executing TC1");
	}
	
	@Test
	public void TC2()
	{
		System.out.println("Executing TC2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Executing after method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Executing after class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Executing after test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Executing after suite");
	}
	
	

}
