package JavaPrograms;

import java.util.Scanner;

public class CheckingLargestOfThreeNumbers 
{

	public static void main(String[] args) 
	{
		System.out.println("Program For Checking Largest Of Three Numbers");

		
		//Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3= sc.nextInt();
        
        //comparing using conditional statements
        if (num1 >= num2 && num1>= num3) 
        {
            System.out.println("Largest number is: " + num1);
        } 
        else if (num2>= num1&& num2 >= num3) 
        {
            System.out.println("Largest number is: " + num2);
        } 
        else
        {
            System.out.println("Largest number is: " + num3);
        }
        

	}

}
