package TestExecution;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseConfiguration;

@Listeners(listenerlibrary.ListenerImplementation.class)
public class ComputerProduct  extends BaseConfiguration
{
	@Test(groups="IT")
	public void orderComputer_Desktop()
	{
		Reporter.log("order Computer Desktop Sucess",true);
	}

}
