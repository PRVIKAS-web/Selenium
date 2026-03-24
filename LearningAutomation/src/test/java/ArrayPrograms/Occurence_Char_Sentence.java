package ArrayPrograms;

import java.util.LinkedHashMap;

public class Occurence_Char_Sentence 
{

	public static void main(String[] args) 
	{
		
       String str1="my name is my name is vicky"; 
       String str[]=str1.split(" ");
//       for(String word:str)
//       {
//    	   System.out.println(word);
//       }
	   LinkedHashMap<String,Integer>lhp=new LinkedHashMap();
	   for(int i=0;i<str.length;i++)
	   {
		   if(lhp.containsKey(str[i]))
		   {
		     lhp.put(str[i], lhp.get(str[i])+1);
		   }
		   else
		   {
			   lhp.put(str[i],1);
		   }
			   
	 
	   }
	        System.out.println(lhp);
	        //printing unique elements
	 		for(String key : lhp.keySet())
	         {
	         	if(lhp.get(key)==1)
	         	{
	         		System.out.println("Unique Elements::"+key);
	         	}
	         	
	         }
	 		//printing duplicates
	 		for(String key : lhp.keySet())
	         {
	         	if(lhp.get(key)>1)
	         	{
	         		System.out.println("Duplicate Elements::"+key);
	         	}
	         	
	         }
       
	}

}
