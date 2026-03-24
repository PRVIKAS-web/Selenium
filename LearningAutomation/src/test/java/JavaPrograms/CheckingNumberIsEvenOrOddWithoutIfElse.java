package JavaPrograms;

import java.util.Scanner;

public class CheckingNumberIsEvenOrOddWithoutIfElse 
{
	public static void main(String[] args)
	{
		System.out.println("Program For Checking Number is Even Or Odd Number Without Using If Else Block");
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=sc.nextInt();
		
		//using conditional operator
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(number+" is a " + result);
        

	}

}
