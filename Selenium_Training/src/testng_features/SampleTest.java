package testng_features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
	public void Demo()
	{
		System.out.println("welcome to Testng");
	}
	
	@Test
	public void RegisterTest()
	{
		System.out.println("Executing the Register Test Case");
	}
	
	@Test
	public void LoginTest()
	{
		System.out.println("Executing the Login Test Case");
	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("Executing the Search Test Case");
	}
	
	

}
