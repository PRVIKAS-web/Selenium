package testng_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider {
	
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][]data=new Object[1][2];
		
		data[0][0]="Rohit";
		data[0][1]="Sharma";
		
		data[1][0]="Virat";
		data[1][1]="Kohli";
		
		data[2][0]="Hardik";
		data[2][1]="Pandya";
		
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void TC1(String firstname,String lastname)
	{
		System.out.println(firstname+" "+lastname);
		
	}

}
