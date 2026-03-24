package JavaPrograms;

import java.util.Scanner;

public class PrintingAllDigitsFromLastPlace {

	public static void main(String[] args) 
	{
        System.out.println("Program For Printing All Digits From Last Place in a Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       
        while(number>0)
        {
        	 int digit=number%10;
        	 System.out.print(digit);
        	 number=number/10; 
        }
       

	}

}
