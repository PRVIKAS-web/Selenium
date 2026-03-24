package JavaPrograms;

import java.util.Scanner;

public class CheckingNumberIsEvenOrOddUsingSwitchCase 
{

	public static void main(String[] args) 
	{
		System.out.println("Program For Checking Number is Even Or Odd Number  Using Switch Case");

		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
	    int number=sc.nextInt();
	    
	    //Using Switchcase
		switch(number%2)
		{
		case 0:System.out.println(number+" is a Even Number");break;
		case 1:System.out.println(number+" is a Odd Number");
		}

	}

}
