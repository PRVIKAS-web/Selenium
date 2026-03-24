package AllProductTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_RedBus {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
       WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		
	
		WebElement ele = driver.findElement(By.xpath("//input[@id='srcinput']"));
		
		boolean enable = ele.isEnabled();
		
		System.out.println(enable);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",ele);
		
		//driver.findElement(By.xpath("//input[@class='searchInput___6dcdc4']"))
		
		ele.sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//div[text()='Lakdikapul']")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='destinput']"));
	
		js.executeScript("arguments[0].click()",ele1);
		
        ele1.sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//div[text()='Madiwala, Bangalore']")).click();
		
		driver.findElement(By.xpath("//button[@class='primaryButton___af12b1 searchButtonWrapper___7ffc91 ']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='srpList__ind-search-styles-module-scss-EOdde']//div[@class='travelsName___023aae'] | //p[@class='droppingTime___4f479a']"));

		String path="./TestData/BusData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook=WorkbookFactory.create(fis);
		int i=0;
		
		for(WebElement elem : elements)
		{
		  String data=elem.getText();
		  workbook.getSheet("sheet1").createRow(i++).createCell(0).setCellValue(data);
		}	
		FileOutputStream fos=new FileOutputStream(path);
		workbook.write(fos);
		workbook.close();
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
