package TestExecution;



import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseConfiguration;

@Listeners(listenerlibrary.ListenerImplementation.class)
public class BookProduct extends BaseConfiguration
{
	@Test(groups="FT")
	public void orderBook_HealthBook()
	{
		stdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String exptitle="Demo web shop";
		String acttitle=stdriver.getTitle();
		
		Assert.assertEquals(acttitle,exptitle);

		Reporter.log("order Book_HealthBook Sucess",true);;
	}

}
