package JavaGrooming;

import java.util.Scanner;

public class Reversenumber 
{
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=(rev*10)+d;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number::: ");
		int num=sc.nextInt();
		 int reversed=reverse(num);
		 System.out.println(reversed);
				 
		
		
		
	}

}
