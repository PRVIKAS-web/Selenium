import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseConfiguration;

public class ProductTest extends BaseConfiguration 
{
	@Test
	public void OrderProductBook()
	{
		Reporter.log("Book Product Order Sucess",true);

	}
	
	@Test
	public void OrderProductComputer()
	{
		Reporter.log("Computer Product Order Sucess",true);

	}

}
