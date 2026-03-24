package ArrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Occurence_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(1);
		
		LinkedHashMap<Integer,Integer>lhp=new LinkedHashMap();
		   for(int i=0;i<a.size();i++)
		   {
			   if(lhp.containsKey(a.get(i)))
			   {
			     lhp.put(a.get(i), lhp.get(a.get(i))+1);
			   }
			   else
			   {
				   lhp.put(a.get(i),1);
			   }
				   
		   }
		   System.out.println(lhp);
	         //printing unique elements
	 		for(Integer key : lhp.keySet())
	         {
	         	if(lhp.get(key)==1)
	         	{
	         		System.out.println("Unique Elements"+key);
	         	}
	         	
	         }
	 		//duplicates
	 		for(Integer key : lhp.keySet())
	         {
	         	if(lhp.get(key)>1)
	         	{
	         		System.out.println("Duplicate Elements"+key);
	         	}
	         	
	         }
     
		
	}

}
