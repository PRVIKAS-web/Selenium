package Daily_Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Red_Bus {
	@Test()
	public void redBus() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement from = wait.until(ExpectedConditions.elementToBeClickable(By.id("srcinput")));

		from.sendKeys("Hyderabad");
		WebElement froms = wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@aria-label='Popular Boarding Points near you']/descendant::div[text()='Kukatpally']")));
		froms.click();
		WebElement dest = wait.until(ExpectedConditions.elementToBeClickable(By.id("destinput")));

		dest.sendKeys("Banglore");
		WebElement dests = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@aria-label='Search suggestions list']/descendant::div[text()='Bangalore']")));
		dests.click();
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='primaryButton___af12b1 searchButtonWrapper___7ffc91 ']")));
		button.click();

		List<WebElement> bus = driver.findElements(By.xpath(
				"//li[@class='tupleWrapper___16efd2 undefined     ']/descendant::div[@class='travelsName___023aae']"));
		List<WebElement> Time = driver.findElements(By.xpath("//p[@class='boardingTime___38d269']"));
		FileInputStream fis = new FileInputStream("./Test/Bus_Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("Sheet1");
//		int rowNum = 0;
//		for (WebElement busName : bus) {
//			String name = busName.getText();
//			System.out.println(name);
//			 Row row = sheet.createRow(rowNum++);
//			    row.createCell(0).setCellValue(name);
//		}
		for (int i = 0; i < bus.size(); i++) {

			String name = bus.get(i).getText();
			String time = Time.get(i).getText();
			System.out.print(name);
			System.out.println("  " + time);

			wb.getSheet("Sheet1").createRow(i).createCell(0).setCellValue(name);
			wb.getSheet("Sheet1").getRow(i).createCell(1).setCellValue(time);
		}

		FileOutputStream fos = new FileOutputStream("./Test/Bus_Data.xlsx");
		wb.write(fos);
		// wb.close();
		driver.quit();
	}
}
