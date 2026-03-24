package JavaGrooming;

import java.util.Scanner;

public class Anagramstring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a String1::: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter  a String2::: ");
		String str2=sc.nextLine();
		if(str1.length()!=str2.length())
		{
			System.out.println("not anagram string");
			return;
		}
		for(int i=0;i<=str1.length()-1;i++)
		{
			char ch=str1.charAt(i);
			int count1=0;
			int count2=0;
			for(int j=0;j<=str1.length()-1;j++)
			{
				char c1=str1.charAt(j);
				if(c1==ch)
				{
					count1++;
				}
			}
			for(int k=0;k<=str2.length()-1;k++)
			{
				char c2=str2.charAt(k);
				if(c2==ch)
				{
					count2++;
				}
			}
			if(count1!=count2)
			{
				System.out.println("Not anagram");
				return;
			}
			
			
		}
		System.out.println("Anagram string");
		

	}

}
