package JavaPrograms;

import java.util.Scanner;

public class CheckingLargestOfTwoNumbers 
{

	public static void main(String[] args)
	{
		System.out.println("Program For Checking Largest Of Two Numbers");

		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        //Comparing using conditional statements
        if (num1 > num2) 
        {
            System.out.println("Largest number is: " + num1);
        } 
        else if (num2 > num1) 
        {
            System.out.println("Largest number is: " + num2);
        } 
        else 
        {
            System.out.println("Both numbers are equal");
        }

	}

}
