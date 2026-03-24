package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LeranPriority
{
	@Test(priority=2)
	public void Book()
	{
		Reporter.log("Book",true);
	}
	
	@Test(priority=1)
	public void Computer()
	{
		Reporter.log("Computer",true);
	}
	
	@Test(priority=3)
	public void Electronics()
	{
		Reporter.log("Electronics",true);
	}
	
	

}
