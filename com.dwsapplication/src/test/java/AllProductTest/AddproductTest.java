package AllProductTest;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Pagerepository.Bookpage;
import Pagerepository.Desktoppage;
import Pagerepository.OrderProduct;
import genericlibrary.BaseConfiguration;

public class AddproductTest extends BaseConfiguration
{
	
	

	
	@Test
	public static void Bookorderproduct() 
	{
		
		Bookpage bookpageref=new Bookpage();
		bookpageref.getSearchbox().sendKeys("Book");
		
		bookpageref.getSearchbutton().click();
		bookpageref.getHealthbook().click();
		bookpageref.getAddtocart().click();
		bookpageref.getShoopingcart().click();

	}
	
	@Test
	public static void Desktoporderproduct() 
	{
	   Desktoppage desktoppageref=new Desktoppage();
	   desktoppageref.getSearchbox().sendKeys("Desktop");
	   desktoppageref.getSearchbutton().click();
	   desktoppageref.getDesktop().click();
	   desktoppageref.getAddtoComparelistbutton().click();
	   desktoppageref.getRemovebutton().click();
	   
	}
	
	

}
