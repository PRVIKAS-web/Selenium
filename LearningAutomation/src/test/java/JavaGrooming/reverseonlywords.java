package JavaGrooming;

import java.util.Scanner;

public class reverseonlywords {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a String::: ");
		String str=sc.nextLine();
		
		String result="";
		String word="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				word=ch+word;
			}
			else
			{
				result=result+word;
				word="";
				result=result+" ";
				
			}
		}
		result=result+word;
		System.out.println(result);

	}

}
