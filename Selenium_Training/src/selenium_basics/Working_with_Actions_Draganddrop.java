package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_Draganddrop {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
        
        driver.manage().window().maximize();
        
        Actions action=new Actions(driver);
        
        WebElement source=driver.findElement(By.xpath("//p[text()=\"I'm draggable but can't be dropped\"]"));

       WebElement destination=driver.findElement(By.xpath("(//p[text()=\"Drag me to my target\"])[1]"));

       action.dragAndDrop(source, destination).perform();
	}

}
