package listenerlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import genericlibrary.BaseConfiguration;

public class ListenerImplementation implements ITestListener
{
	
	Random robj=new Random();
	int randomnum=robj.nextInt(1000);
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseConfiguration.stdriver;
		
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		
		File perpath=new File("./TestScreenshot/"+result.getName()+"_screenshot"+randomnum+".png");
		
		try {
			FileHandler.copy(temppath, perpath);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Reporter.log(result.getName()+"-Failure screenshot capture sucess",true);

		
		
	}

}
