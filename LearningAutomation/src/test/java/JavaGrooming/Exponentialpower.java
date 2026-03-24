package JavaGrooming;

import java.util.Scanner;

public class Exponentialpower 
{
	public static int exponatial(int base,int power )
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base::: ");
		int b=sc.nextInt();
		
		System.out.println("Enter a power::: ");
		int p=sc.nextInt();
		
		int expovalue=exponatial(b,p);
		System.out.println(expovalue);

	}

}
