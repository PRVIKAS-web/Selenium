package com.StringPrograms;

import java.util.LinkedHashMap;

public class Occurence_Each_Character {

	public static void main(String[] args) 
	{
		String name="vickyvvvv";
		LinkedHashMap<Character,Integer> hmap=new LinkedHashMap();
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(hmap.containsKey(ch[i]))
			{
				hmap.put(ch[i], hmap.get(ch[i])+1);
			}
			else
			{
				hmap.put(ch[i], 1);
			}
		}
		System.out.println(hmap);

	}

}
