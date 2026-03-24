package Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookpage 
{
	// Identify searchbox
    @FindBy(id="small-searchterms")
	private WebElement searchbox;

	

	// identify searchbutton
    @FindBy(xpath="//input[@value='Search']")
	private WebElement searchbutton;

	

	// identify healthbook product
    @FindBy(xpath="//a[text()='Health Book'])[2]")
	private WebElement healthbook ;
	

	// identify add to cart
    @FindBy(xpath="//input[@id='add-to-cart-button-22']")
	private WebElement addtocart ;
	

    //shoppingcart
    @FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoopingcart;
	

	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}


	public WebElement getHealthbook() {
		return healthbook;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getShoopingcart() {
		return shoopingcart;
	}


	
	
	



}
