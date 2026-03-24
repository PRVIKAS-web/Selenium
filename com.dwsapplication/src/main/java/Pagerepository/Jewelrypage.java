package Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jewelrypage
{

	// Identify searchbox
    @FindBy(id="small-searchterms")
	private WebElement searchbox;

	

	// identify searchbutton
    @FindBy(xpath="//input[@value='Search']")
	private WebElement searchbutton;

	

	// identify Jewelry product
    @FindBy(xpath="//a[text()='Create Your Own Jewelry']")
	private WebElement Jewelry ;
    
   // identify Lengthincmtextfield
    @FindBy(xpath="//input[@class='textbox']")
	private WebElement Lengthincmtextfield ;
    
    
	

	// identify add to cart
    @FindBy(xpath="//h1[contains(text(),'Create Your Own Jewelry')]//..//..//input[@id='add-to-cart-button-71']")
	private WebElement addtocart ;
	

    //shoppingcart
    @FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoopingcart;
	
}
