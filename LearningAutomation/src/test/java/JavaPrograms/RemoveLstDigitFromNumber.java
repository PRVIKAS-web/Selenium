package JavaPrograms;

import java.util.Scanner;

public class RemoveLstDigitFromNumber {

	public static void main(String[] args) 
	{
		System.out.println("Program For Removing Last Digit From  a Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result=number/10;
        System.out.println(result);
        

	}

}
