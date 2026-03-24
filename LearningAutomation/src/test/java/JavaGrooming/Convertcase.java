package JavaGrooming;

import java.util.Scanner;

public class Convertcase
{
	public static String tolower(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		return res;
	}
	
	public static String toupper(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
			}
			res=res+ch;
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::: ");
		String str=sc.nextLine();
		
//		String res=tolower(str);
//		System.out.println(res);
		
		String res1=toupper(str);
		System.out.println(res1);
		
		

	}

}
