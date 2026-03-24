package com.StringPrograms;

public class Reverse_String {

	public static void main(String[] args)
	{
		String name="vicky";
		String rev=" ";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		if(rev.equals(name))
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");
	}

}
