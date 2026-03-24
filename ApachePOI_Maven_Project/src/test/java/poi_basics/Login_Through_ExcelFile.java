package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Through_ExcelFile
{
	WebDriver driver;
	
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{
		
		String path="./Test_Data/LoginData.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		 Workbook workbook=WorkbookFactory.create(fis);
		 
		 Sheet sheet=workbook.getSheet("LoginCredentials");
		 
		 int rows=sheet.getPhysicalNumberOfRows();
		 
		 int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		 
		 for(int i=0;i<rows;i++)
		 {
			 for(int j=0;j<columns;j++)
			 {
				    String cellvalue=sheet.getRow(i).getCell(j).toString()+" ";
					System.out.print(cellvalue);
			 }
			 System.out.println();
		 }
		 
		 String url=sheet.getRow(1).getCell(0).toString();
		 String email=sheet.getRow(1).getCell(1).toString();
		 String password=sheet.getRow(1).getCell(2).toString();
        
		 driver=new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.findElement(By.id("Email")).sendKeys(email);
			
		 driver.findElement(By.id("Password")).sendKeys(password);
			
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); 	
		
	}

}
