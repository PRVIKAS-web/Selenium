package JavaPrograms;

import java.util.Scanner;

public class PrintingSumOfDigitsOfNumber 
{

	public static void main(String[] args)
	{
        System.out.println("Program For Printing Sum Of All Digits  in a Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum=0;
       
        while(number>0)
        {
        	 int digit=number%10;
        	 sum=sum+digit;
        	 number=number/10; 
        }
        System.out.println(sum);

	}

}
