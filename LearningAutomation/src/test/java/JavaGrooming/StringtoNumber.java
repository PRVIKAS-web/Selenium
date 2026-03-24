package JavaGrooming;

import java.util.Scanner;

public class StringtoNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::: ");
		String str=sc.nextLine();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&& ch<='9')
			{
				System.out.print(ch-'0');
			}
		}

	}

}
