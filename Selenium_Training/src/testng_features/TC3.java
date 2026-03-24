package testng_features;

import org.testng.annotations.Test;

public class TC3 
{
	@Test(dataProvider="TestData",dataProviderClass=Working_with_DataProvider.class)
	public void tc3(String firstname,String lastname)
	{
		System.out.println(firstname+" "+lastname  );
	}

}
