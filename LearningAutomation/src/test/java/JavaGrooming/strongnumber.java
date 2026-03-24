package JavaGrooming;

import java.util.Scanner;

public class strongnumber 
{
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static int sumofdigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+factorial(d);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number::: ");
		int num=sc.nextInt();
		int factorial=sumofdigits(num);
		if(factorial==num)
		{
			System.out.println(num+" is a strong number");
		}
		else
		{
			System.out.println(num+"is not a strong number");

		}
		
		
	}

}
