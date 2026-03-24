package Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart 
{
	
	@FindBy(xpath="//select[@id='CountryId']")
	private WebElement countrydropdown;
	
	@FindBy(xpath="//select[@id='StateProvinceId']")
	private WebElement statedropdown;
	
	@FindBy(xpath="//input[@id='ZipPostalCode']")
	private WebElement zippostalcode;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	
	
	
	
	public Shoppingcart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}





	public WebElement getCountrydropdown() {
		return countrydropdown;
	}





	public WebElement getStatedropdown() {
		return statedropdown;
	}





	public WebElement getZippostalcode() {
		return zippostalcode;
	}





	public WebElement getCheckbox() {
		return checkbox;
	}





	public WebElement getCheckout() {
		return checkout;
	}
	
	
	

}
