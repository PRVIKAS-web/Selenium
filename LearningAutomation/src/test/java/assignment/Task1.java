package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Navigate To URL
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Verify Page
		String act_url = driver.getCurrentUrl();
		String exp_title = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if (act_url.equals(exp_title)) {
			System.out.println("url Is verified");

		} else {
			System.out.println("url is not verified");
		}

		// Login
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		if (username.isDisplayed() && password.isDisplayed() && LoginButton.isDisplayed()) {
			System.out.println("username,Password,LoginButton Is Displayed");

		} else {
			System.out.println("username,Password,LoginButton Is Not Displayed");
		}
		if (username.isEnabled() && password.isEnabled() && LoginButton.isEnabled()) {
			System.out.println("username,Password,LoginButton Is Enabled");

		} else {
			System.out.println("username,Password,LoginButton Is  Not Enabled");
		}

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		LoginButton.click();

		// Verify Homepage
		WebElement HomePage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		if (HomePage.isDisplayed()) {
			System.out.println("HomePage Is Displayed");

		} else {
			System.out.println("HomePage Is Not Displayed");
		}

		WebElement PIM = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
		PIM.click();

		// verify PIM Page
		WebElement PIMPage = driver.findElement(By.xpath("//h5[text()='Employee Information']"));
		if (PIMPage.isDisplayed()) {
			System.out.println("PIMPage Is Displayed");

		} else {
			System.out.println("PIMPage Is Not Displayed");
		}

		WebElement AddEmp = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		AddEmp.click();

		WebElement AddEmptext = driver.findElement(By.xpath("//h6[text()='Add Employee']"));
		if (AddEmptext.isDisplayed()) {
			System.out.println("AddEmptext Is Displayed");

		} else {
			System.out.println("AddEmptext Is Not Displayed");
		}

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement middlename = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		if (firstname.isDisplayed() && middlename.isDisplayed() && lastname.isDisplayed()) {
			System.out.println("firstname,Middlename,LastName Is Displayed");

		} else {
			System.out.println("firstname,Middlename,LastNameIs Not Displayed");
		}
		if (firstname.isEnabled() && middlename.isEnabled() && lastname.isEnabled()) {
			System.out.println("firstname,Middlename,LastName Is Enabled");

		} else {
			System.out.println("firstname,Middlename,LastName Is  Not Enabled");
		}

		firstname.sendKeys("alpha");
		middlename.sendKeys("beta");
		lastname.sendKeys("Gamma");
		
		WebElement empid = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		empid.sendKeys("4441");
		
		

		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		if (save.isDisplayed()) {
			System.out.println("save Is Displayed");

		} else {
			System.out.println("save Is Not Displayed");
		}
		if (save.isEnabled()) {
			System.out.println("save Is Enabled");

		} else {
			System.out.println("save Is  Not Enabled");
		}
		save.click();
		
		WebElement save_Ver = driver.findElement(By.xpath("//p[text()='Success']"));
		System.out.println(save_Ver.getText());
		

		
		

		// verify Add Employee
		WebElement AddEmp_Ver = driver.findElement(By.xpath("//h6[text()='alpha Gamma']"));
		if (AddEmp_Ver.isDisplayed()) {
			System.out.println("AddEmp_Ver Is Displayed");

		} else {
			System.out.println("AddEmp_Ver Is Not Displayed");
		}
		System.out.println("ADD Employee Verification::" + AddEmp_Ver.getText());

		driver.close();

	}

}
