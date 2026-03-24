package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertyFile {

	public static void main(String[] args) throws IOException
	{
       String path="./Test_Configuration/Login.properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		prop.setProperty("name", "vicky");

	}

}
