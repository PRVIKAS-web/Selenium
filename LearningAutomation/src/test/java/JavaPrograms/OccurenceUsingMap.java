package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceUsingMap 
{

	public static void main(String[] args) 
	{
		//using map
		String name="vikasvicky";
//		Map<Character,Integer>hmap=new HashMap();
//		for(int i=0;i<name.length();i++)
//		{
//			char ch=name.charAt(i);
//			if(hmap.containsKey(ch))
//			{
//				hmap.put(ch, hmap.get(ch)+1);
//			}
//			else
//			{
//				hmap.put(ch,1);
//			}
//		}
//		System.out.println(hmap);
//		
		//using linkedhashmap
		LinkedHashMap<Character,Integer>lhp=new LinkedHashMap();
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(lhp.containsKey(ch))
			{
				lhp.put(ch, lhp.get(ch)+1);
			}
			else
			{
				lhp.put(ch, 1);
			}
		}
		System.out.println(lhp);

	}

}
