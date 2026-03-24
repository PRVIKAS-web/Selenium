package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Working_With_ExcelFile
{
	@Test
	public void demo() throws EncryptedDocumentException, IOException
	{
		String path="./Test_Data/DWS_TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
	
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("Names");
		
        //String row_value=sheet.getRow(2).getCell(1).toString();
		
		//System.out.println(row_value);
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		
		System.out.println(colcount);
		
		for(int i=0;i<rowcount-1;i++)
		{
			for(int j=0;j<=colcount-1;j++)
			{
			String cellvalue=sheet.getRow(i).getCell(j).toString()+" ";
			System.out.print(cellvalue);
			}
			System.out.println();
		}
		
		
		
	}

}
