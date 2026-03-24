package JavaPrograms;

import java.util.Scanner;

public class PrintingLastDigitFromNumber {

	public static void main(String[] args) 
	{
        System.out.println("Program For Printing Last Digit From  a Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int lastdigit=number%10;
        System.out.println(lastdigit);

	}

}
