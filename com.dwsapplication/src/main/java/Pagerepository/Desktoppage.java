package Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Desktoppage 
{
	// Identify searchbox
    @FindBy(id="small-searchterms")
	private WebElement searchbox;

	

	// identify searchbutton
    @FindBy(xpath="//input[@value='Search']")
	private WebElement searchbutton;
    
    //identify Desktop product
    @FindBy(xpath="//a[text()='Desktop PC with CDRW']")
	private WebElement Desktop ;
    
    
  //identify Add to Compare list
    @FindBy(xpath="//a[text()='Desktop PC with CDRW']")
	private WebElement AddtoComparelistbutton;
    
    
   //identify Remove
    @FindBy(xpath="//input[@title='Remove']")
	private WebElement removebutton;
    
    
   public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}


	public WebElement getDesktop() {
		return Desktop;
	}


	public WebElement getAddtoComparelistbutton() {
		return AddtoComparelistbutton;
	}


	public WebElement getRemovebutton() {
		return removebutton;
	}


	
    
    


}
