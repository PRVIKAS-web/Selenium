package JavaGrooming;

import java.util.Scanner;

public class Checkvcns {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::: ");
		String str=sc.nextLine();
		
		for(int i=0;i<=str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				System.out.println(ch+"-->"+"vowel");
			}
			else if(ch>='A'&&ch<='Z' ||ch>='a'&&ch<='z')
			{
				System.out.println(ch+"-->"+"consonent");

			}
			else if(ch>='0'&&ch<='9')
			{
				System.out.println(ch+"-->"+"number");

			}
			else
			{
				System.out.println(ch+"-->"+"special character");

			}
			
		     }

	}

}
