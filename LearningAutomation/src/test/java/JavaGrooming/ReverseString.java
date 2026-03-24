package JavaGrooming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::: ");
		String str=sc.nextLine();
		
		String rev="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
