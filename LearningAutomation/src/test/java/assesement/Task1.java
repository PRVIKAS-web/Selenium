package assesement;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlibrary.BaseConfiguration;

public class Task1 
{
	
	@BeforeClass
	public void browsersetup()
	{
		String  expectedbrowsername="chrome";
		String  actualbrowsername="chrome";
		Reporter.log("browser opened sucess",true);
		Assert.assertEquals(expectedbrowsername,actualbrowsername );
	}
	@BeforeMethod
	public void login()
	{
		String expectedtext="Demo web shop";
		String actualtext="Demo web shop";
		
		Reporter.log("login sucess",true);
		Assert.assertEquals(expectedtext,actualtext);

		
	}
	
	@Test(priority=1,enabled=true,invocationCount=2,groups="FunctionalityTesting",dataProvider="fooditem")
	public void vicky()
	{
		String expectedproductname="Book";
		String actualproductname="Book";
		
		Reporter.log("I am Vicky",true);
		Assert.assertEquals(expectedproductname,actualproductname);
		
	}
	@Test(priority=2,enabled=true,dependsOnMethods="vicky",groups="IntegrationTesting")
	public void vijii()
	{
		String expectedproductname="Computer";
		String actualproductname="Computer";
		
		Reporter.log("I am Vijji",true);
		Assert.assertEquals(expectedproductname,actualproductname);
		
		
		
	}
	@Test(priority=3,enabled=true,dependsOnMethods="vicky",groups="FunctionalityTesting")
	public void hyma()
	{
		String expectedproductname="Electronic";
		String actualproductname="Electronic";
		
		Reporter.log("I am Hyma",true);
		Assert.assertEquals(expectedproductname,actualproductname);

		
	}
	
	@AfterMethod
	public void logout()
	{
		String expectedtext="Login";
		String actualtext="Login";
		Reporter.log("logout sucess",true);
		Assert.assertEquals(expectedtext,actualtext);

	}
	
	@AfterClass
	public void browserterminate()
	{
		int expectedbrowsersize=110;
		int actualbrowsersize=110;
		
		Reporter.log("browser closed sucess",true);
		Assert.assertEquals(expectedbrowsersize,actualbrowsersize);

	}
	
	@DataProvider
	public Object[][] fooditem()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="idli";
		data[0][1]="biryani";
		data[0][2]="chapathi";
		
		data[1][0]="Dosa";
		data[1][1]="eggfried";
		data[1][2]="roti";
		
		data[2][0]="puri";
		data[2][1]="chickenfried";
		data[2][2]="puri";
		
		return data;
		
	}

}
