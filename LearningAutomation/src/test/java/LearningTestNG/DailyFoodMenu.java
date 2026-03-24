package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DailyFoodMenu
{
	@Test(priority=1)
	public void Chutney()
	{
		Reporter.log("Chutney",true);
	}
	@Test(priority=2,dependsOnMethods="Chutney",invocationCount=5)
	public void Idly()
	{
		Reporter.log("Idly",true);
	}
	@Test(priority=3)
	public void Rytha()
	{
		Reporter.log("Rytha",true);
	}
	
	@Test(priority=4,dependsOnMethods="Rytha",invocationCount=2)
	public void Biryani()
	{
		Reporter.log("Biryani",true);
	}
	@Test(priority=5)
	public void EggCurry()
	{
		Reporter.log("Eggcurry",true);
	}
	
	@Test(priority=6,dependsOnMethods="EggCurry",invocationCount=6)
	public void Chapathi()
	{
		Reporter.log("Chapathi",true);
	}
	
	@Test(enabled=false)
	public void CurdRice()
	{
		Reporter.log("CurdRice",true);
	}
	

}
