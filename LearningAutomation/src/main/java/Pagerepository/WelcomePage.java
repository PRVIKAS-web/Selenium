package Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	//Identify The Elements
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Registerlink;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Loginlink;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement Loginout;
	
	


	@FindBy(xpath="//a[text()='Shopping cart']")
	private WebElement ShoppingCartlink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement Wishlistlink;
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	private WebElement BooksLink;
	
	@FindBy(xpath="//span[@class='price actual-price']/../../..//a[text()='Health Book']")
	private WebElement HealthBooksLink;
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement ComputersLink;
	
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	private WebElement ElectronicsLink;
	
	@FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement AppareShoesLink;
	
	@FindBy(xpath="(//a[contains(text(),'Digital download')])[1]")
	private WebElement DigitaldownloadLink;
	
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	private WebElement JewelryLink;
	
	
	//initialization using constructor
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization of getter/setter method

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public WebElement getLoginout() {
		return Loginout;
	}

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}

	public WebElement getWishlistlink() {
		return Wishlistlink;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}
	
	public WebElement getHealthBooksLink() {
		return HealthBooksLink;
	}


	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getAppareShoesLink() {
		return AppareShoesLink;
	}

	public WebElement getDigitaldownloadLink() {
		return DigitaldownloadLink;
	}

	public WebElement getJewelryLink() {
		return JewelryLink;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
