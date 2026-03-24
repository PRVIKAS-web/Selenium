package Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Loginlink;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement EmailTextfield;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement PasswordTextfield;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getLoginlink() {
		return Loginlink;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	

}
