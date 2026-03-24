package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningDependsOnMethod
{
	@Test()
	public void Book()
	{
		Reporter.log("Book",true);
	}
	
	@Test(dependsOnMethods="Book")
	public void Computer()
	{
		Reporter.log("Computer",true);
	}

}
