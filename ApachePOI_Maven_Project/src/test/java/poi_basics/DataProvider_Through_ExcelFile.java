package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Through_ExcelFile
{
	WebDriver driver;
	
	@DataProvider(name="LoginData")
	public Object[][]Login() throws EncryptedDocumentException, IOException
	{
		
        String path="./Test_Data/LoginData.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		 Workbook workbook=WorkbookFactory.create(fis);
		 
		 Sheet sheet=workbook.getSheet("LoginCredentials");
		 
		 int rows=sheet.getPhysicalNumberOfRows();
		 
		 int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		 
		 Object[][] data=new Object[rows-1][columns];
		 
		 for(int i=1;i<rows;i++)
		 {
			 for(int j=0;j<columns;j++)
			 {
				 data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			 }
			 
		 }
		 return data;
		 
		 
	}
	
	@Test(dataProvider="LoginData")
	public void Login(String url,String email,String password)
	{
		 driver=new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.findElement(By.id("Email")).sendKeys(email);
			
		 driver.findElement(By.id("Password")).sendKeys(password);
			
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); 
	}

}
