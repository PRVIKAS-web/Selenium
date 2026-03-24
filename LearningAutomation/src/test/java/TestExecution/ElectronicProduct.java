package TestExecution;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseConfiguration;

@Listeners(listenerlibrary.ListenerImplementation.class)
public class ElectronicProduct extends BaseConfiguration
{
	@Test(groups="ST")
	public void orderElectronic_CellPhone()
	{
		Reporter.log("order Electronic CellPhone Sucess",true);
	}


}
