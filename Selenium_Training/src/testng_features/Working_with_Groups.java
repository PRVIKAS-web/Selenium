package testng_features;

import org.testng.annotations.Test;

public class Working_with_Groups
{
	
	@Test(groups="SmokeTest")
	public void LoginTest()
	{
		System.out.println("Executing LoginTest");
	}
	
	@Test(groups="SmokeTest")
	public void RegisterTest()
	{
		System.out.println("Executing Register Test");

	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("Executing Search Test");

	}

}
