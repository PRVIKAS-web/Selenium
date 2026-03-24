package testng_features;

import org.testng.annotations.Test;

public class Working_with_Groups1
{
	@Test(groups="SmokeTest")
	public void AddtoCartTest()
	{
		System.out.println("Executing AddToCart Test");
	}

	@Test(groups="SmokeTest")
	public void SubscribeTest()
	{
		System.out.println("Executing Subscribe Test");
	}
	
	@Test
	public void VoteTest()
	{
		System.out.println("Executing vote Test");
	}

}
