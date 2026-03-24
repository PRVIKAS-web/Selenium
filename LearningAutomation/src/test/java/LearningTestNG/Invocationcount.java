package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount 
{
	@Test(invocationCount=2)
	public void Book()
	{
		Reporter.log("Book",true);
	}
	

}
