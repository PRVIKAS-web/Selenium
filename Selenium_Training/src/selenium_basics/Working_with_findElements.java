package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findElements {

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
        
        System.out.println(radiobuttons);
        
        for(int i=0;i<radiobuttons.size()-1;i++)
        {
        	radiobuttons.get(i).click();
        	System.out.println(radiobuttons.get(i).isSelected());
        }
        
//        List<WebElement> alllinks_text=driver.findElements(By.tagName("a"));
//        
//        System.out.println(alllinks_text);
//        
//        for(int i=0;i<alllinks_text.size()-1;i++)
//        {
//        	System.out.println(alllinks_text.get(i).getText());
//        }
//        
        
        

	}

}
