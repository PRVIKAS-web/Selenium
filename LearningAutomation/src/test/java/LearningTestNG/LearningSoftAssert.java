package LearningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert 
{
	WebDriver driver = new ChromeDriver();
	
	
	@Test
    public void orderProduct()
    {
		driver.get("https://demowebshop.tricentis.com/");
		
		
		SoftAssert sa=new SoftAssert();
		
		//Validate webpage Title
		String exptitle="Demo Web Shop";
		String acttitle=driver.getTitle();
		sa.assertEquals(exptitle, acttitle);
		Reporter.log("Title is Verified Sucess",true);
		
		//validate  welcometext displaystatus
		WebElement element=driver.findElement(By.xpath("//p[text()='Welcome to the new Tricentis store!']"));
		boolean expstatus=true;
		boolean actstatus=element.isDisplayed();
		sa.assertEquals(expstatus, actstatus);
		Reporter.log("DisplayStatus is Verified Sucess",true);

		
		//validate welcome text
		String exptext="Welcome to the new Tricentis store!";
		String acttext=element.getText();
		sa.assertEquals(exptext, acttext);
		Reporter.log("Text is Verified Sucess",true);
		
		int expxcoor=255;
		int actxcoor=element.getLocation().getX();
		//System.out.println(element.getLocation().getX());
		sa.assertEquals(expxcoor,actxcoor);
		Reporter.log("X coor validated",true);
		
		int expycoor=632;
		int actycoor=element.getLocation().getY();
        //System.out.println(element.getLocation().getY());
		sa.assertEquals(expycoor,actycoor);
		Reporter.log("y coor validated",true);

		int expheight=14;
		int actheight=element.getSize().getHeight();
		//System.out.println(element.getSize().getHeight());
		sa.assertEquals(expheight,actheight);
		Reporter.log("height validated",true);

		int expwidth=510;
		int actwidth=element.getSize().getWidth();
		//System.out.println(element.getSize().getWidth());
		sa.assertEquals(expwidth,actwidth);
		Reporter.log("width validated",true);
		
		
		
		driver.close();
		
		sa.assertAll();
		
		

		
    }

}
