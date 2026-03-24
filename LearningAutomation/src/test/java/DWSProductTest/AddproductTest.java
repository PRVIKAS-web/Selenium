package DWSProductTest;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Pagerepository.OrderProduct;
import genericlibrary.BaseConfiguration;

public class AddproductTest extends BaseConfiguration
{
	
	

	
	@Test
	public static void orderproduct() 
	{
		//input into searchbox
		OrderProduct op=new OrderProduct();
		op.getSearchbox().sendKeys("Book");
		
		// click on searchbutton
		op.getSearchbutton().click();

		

		// identify healthbook product
		op.getHealthbook().click();

		
		

		// click on addtocart
		op.getAddtocart().click();

		// shoppingcart
		op.getShoopingcart().click();
		
		
		Reporter.log("order product sucessfully");
		
		
		
		
		
		
		
       
		

	}

}
