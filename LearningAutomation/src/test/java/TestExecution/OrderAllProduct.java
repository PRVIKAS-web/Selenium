package TestExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pagerepository.WelcomePage;
import genericlibrary.BaseConfiguration;

public class OrderAllProduct extends BaseConfiguration {

	@Test(dataProvider = "searchData")
	public void orderProduct(String data1) {
		
		WelcomePage welcomeobj=new WelcomePage(driver);

		// Enter Input Into The SearchBox
		welcomeobj.getSearchbox().sendKeys(data1);
		
		// click on searchbutton
		welcomeobj.getSearchbutton().click();

		// identify healthbook link
		WebElement healthbook = stdriver.findElement(By.xpath("//span[@class='price actual-price']/../../..//a[text()='Health Book']"));
		healthbook.click();
		
		// add to cart
		WebElement addtocart = stdriver.findElement(By.xpath("//input[@id='add-to-cart-button-22']"));
		// click on addtocart
		addtocart.click();
		
		

		

		Reporter.log(data1, true);
		
		Reporter.log("----------------------------", true);

	}

}
