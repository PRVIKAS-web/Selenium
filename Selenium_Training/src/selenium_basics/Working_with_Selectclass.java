package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Selectclass {

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
        
        WebElement books=driver.findElement(By.xpath("//select[@id='products-orderby']"));
        
        Select selobj=new Select(books);
        
        System.out.println(selobj.isMultiple());
        
        //selobj.selectByVisibleText("Name: A to Z");
        
       // selobj.selectByVisibleText("Price: Low to High");
        
        //selobj.selectByIndex(4);
        
       List<WebElement>options= selobj.getOptions();
       
       for(WebElement value:options)
       {
    	   System.out.println(value.getText());
       }

	}

}
