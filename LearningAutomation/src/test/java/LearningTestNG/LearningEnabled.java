package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningEnabled 
{

	
	@Test(enabled=true)
	public void Book()
	{
		Reporter.log("Book",true);
	}
	
	@Test(enabled=false)
	public void Computer()
	{
		Reporter.log("Computer",true);
	}
	
}
