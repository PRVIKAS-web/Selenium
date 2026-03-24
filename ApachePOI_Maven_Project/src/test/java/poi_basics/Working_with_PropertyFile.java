package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_PropertyFile
{
	@Test
	public void demo() throws IOException
	{
		String path="./Test_Configuration/TestConfiguration.properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties prop=new Properties();
		
	    prop.load(fis);
	    
//	    String fname=prop.getProperty("Firstname");
//	    
//	    System.out.println(fname);
	    
	    
	    
	    
	    
	    
	    
		
		
	}
	

}
