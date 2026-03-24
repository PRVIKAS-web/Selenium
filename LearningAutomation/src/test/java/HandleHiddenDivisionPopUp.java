import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleHiddenDivisionPopUp {

	public static void main(String[] args) 
	{

		// TODO Auto-generated method stubh
		ChromeOptions coobj = new ChromeOptions();
		coobj.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(coobj);
		driver.get("https://www.goibibo.com/");
		WebElement closepopup = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		closepopup.click();
		WebElement closepopup1 = driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"));
		closepopup1.click();
	}

}
