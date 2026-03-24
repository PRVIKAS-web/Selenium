package testng_features;

import org.testng.annotations.Test;

public class Working_with_HelperAttributes
{
	@Test(priority=2,dependsOnMethods="RegisterTest")
	public void LoginTest()
	{
		System.out.println("Executing Login Test");
	}
	
	@Test(priority=3)
	public void SearchTest()
	{
		System.out.println("Executing Search Test");
	}
	
	@Test(priority=1)
	public void RegisterTest()
	{
		System.out.println("Executing Register Test");
	}
	
	@Test(priority=4)
	public void SubscribeTest()
	{
		System.out.println("Executing Subscribe Test");
	}
	
	
	

}
