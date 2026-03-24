package HandlingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertiesfile 
{
	public static String readData(String Key) throws IOException
	{
		//Convert physical file into java understandable using fileinputstream
		FileInputStream fis=new FileInputStream("./src/test/resources/Data/dwscommondata.properties");
		
		//create object for properties class 
		Properties prop=new Properties();
		
		//load the property
		prop.load(fis);
		
		//fetch the property using key
		String data=prop.getProperty(Key);
		
		//return the data
		return data;
	}

	public static void main(String[] args) throws IOException 
	{
		// Launch The Browser
	    WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		// IMPLICITWAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		System.out.println(readData("weburl"));
		// Navigate To URL
	   // driver.get(readData("weburl"));

        driver.quit();
	}

}
