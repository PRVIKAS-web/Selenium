package Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage
{
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement Loginout;

	public WebElement getLoginout() {
		return Loginout;
	}
	

	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	



}
