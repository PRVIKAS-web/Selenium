package JavaGrooming;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) 
	{
		String s1="Read";
		String s2="Dear";
		if(s1.length()==s2.length())
		{
			char ch1[]=s1.toLowerCase().toCharArray();
			char ch2[]=s2.toLowerCase().toCharArray();	
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println(s1+" and "+s2+" are anagram string");
			}
			else
			{
				System.out.println(s1+" and "+s2+" are not anagram string");

			}
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagram string");
		}

	}

}
