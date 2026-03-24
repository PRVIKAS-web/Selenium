package LearningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningHardAssert
{
	        // Launch The Browser
			WebDriver driver = new ChromeDriver();
			@Test(priority=1,enabled=false) 
	        public void validateTitle()
	        {
	        	// Navigate To URL
	    		driver.get("https://demowebshop.tricentis.com/");
	    		String exptitle="Demo Web Shop";
	    		String acttitle=driver.getTitle();
	    		Assert.assertEquals(exptitle, acttitle);
	    		Reporter.log("Title is Verified",true);
	        }
	        
			@Test(priority=2,enabled=false)
	        public void validatedisplayStatus()
	        {
	        	// Navigate To URL
	    		driver.get("https://demowebshop.tricentis.com/");
	    		Boolean expStatus=true;
	    		WebElement element= driver.findElement(By.xpath("//a[text()='Log in']"));

	    		Boolean actStatus=element.isDisplayed();
	    		Assert.assertEquals(expStatus,actStatus);
	    		Reporter.log("Status is Verified",true);
	        }
			
			@Test()
			public void alignmentValidation()
			{
				driver.get("https://demowebshop.tricentis.com/");
				WebElement element= driver.findElement(By.xpath("//a[text()='Log in']"));
				//System.out.println(element.getLocation());
				int expxcoor=739;
				int actxcoor=element.getLocation().getX();
				Assert.assertEquals(expxcoor,actxcoor);
				Reporter.log("X coor validated",true);
				
				int expycoor=70;
				int actycoor=element.getLocation().getY();
				Assert.assertEquals(expycoor,actycoor);
				Reporter.log("y coor validated",true);

				int expheight=19;
				int actheight=element.getSize().getHeight();
				Assert.assertEquals(expheight,actheight);
				Reporter.log("height validated",true);

				int expwidth=43;
				int actwidth=element.getSize().getWidth();
				Assert.assertEquals(expwidth,actwidth);
				Reporter.log("width validated",true);

			
				
			}

}
