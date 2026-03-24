package JavaGrooming;

import java.util.Scanner;

public class Armstrong 
{
	public static int countdigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			int d=num/10;
			count++;
		}
		return count++;
	}
	
	public static int exponential(int base,int power)
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	
	public static int sumofdigit(int num)
	{
		int sum=0;
		int count=countdigits(num);
		while(num!=0)
		{
			int d=num%10;
			sum=sum+exponential(d,count);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::: ");
		int num=sc.nextInt();
		int sum=sumofdigit(num);
		if(sum==num)
		{
			System.out.println(num+" is a armstrong number");
		}
		else
		{
			System.out.println(num+" is not a armstrong number");

		}

	}

}
