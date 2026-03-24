package HandlingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelFile 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		        //properties file
		        HandlingPropertiesfile Hpf=new HandlingPropertiesfile();
		        
		        System.out.println("Data Driven Testing:::: ");
		
		        //Launch The Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize The Window
				driver.manage().window().maximize();
				
				//IMPLICITWAIT
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Navigate To URL using propertyfile
				driver.get(Hpf.readData("weburl"));
				
		        //Utilize the data
				WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
				register.click();
				
				WebElement maleradio = driver.findElement(By.xpath("//input[@id='gender-male']"));
				maleradio.sendKeys(readData("RegisterData",1,0));
				
				WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
				firstname.sendKeys(readData("RegisterData",1,1));

				WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
				lastname.sendKeys(readData("RegisterData",1,2));

				WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
				email.sendKeys(readData("RegisterData",3,3));

				WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
				password.sendKeys(readData("RegisterData",1,4));

				WebElement confirmpassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
				confirmpassword.sendKeys(readData("RegisterData",1,5));

				WebElement registerbutton= driver.findElement(By.xpath("//input[@id='register-button']"));
				registerbutton.click();

		

	}
	
	public static String readData(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException 
	{
		//Convert physical file into java understandable using fileinputstream
		FileInputStream fis=new FileInputStream("./src/test/resources/Data/DWSTestData.xlsx");
		
		//create workbook using workbookfactory
		Workbook book=WorkbookFactory.create(fis);
		
		//read the string data
		String data=book.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
		
		//return data
		return data;
		
	}
}
