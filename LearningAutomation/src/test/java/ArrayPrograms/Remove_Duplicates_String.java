package ArrayPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Remove_Duplicates_String {

	public static void main(String[] args)
	{
		String str1="my name is my name is vicky"; 
	       String str[]=str1.split(" ");
		  // LinkedHashMap<String,Integer>lhp=new LinkedHashMap();
		   LinkedHashSet set=new LinkedHashSet();
		   for(int i=0;i<str.length;i++)
		   {
			     set.add(str[i]);    
		   }
		   System.out.println(set);
		   
		   
	}

}
