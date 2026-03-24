package ArrayPrograms;

import java.util.LinkedHashMap;

public class OccurenceArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,1};
		LinkedHashMap<Integer,Integer>lhp=new LinkedHashMap();
		
		for(int i=0;i<a.length;i++)
		{
			
			if(lhp.containsKey(a[i]))
			{
				lhp.put(a[i], lhp.get(a[i]) + 1);
			}
			else
			{
				lhp.put(a[i],1);
			}
		}
		System.out.println(lhp);

	}

}
