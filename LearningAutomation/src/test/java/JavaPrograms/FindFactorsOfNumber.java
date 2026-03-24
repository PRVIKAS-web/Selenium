package JavaPrograms;

import java.util.Scanner;

public class FindFactorsOfNumber {

	public static void main(String[] args) 
	{
        System.out.println("Program For Finding Factors Of Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        for(int i=1;i<=number;i++)
        {
        	if(number%i==0)
        	{
        		System.out.print(i+" ");
        	}
        }
	}

}
