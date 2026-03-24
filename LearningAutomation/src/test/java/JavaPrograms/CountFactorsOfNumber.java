package JavaPrograms;

import java.util.Scanner;

public class CountFactorsOfNumber {

	public static void main(String[] args) 
	{
        System.out.println("Program For Count Number Of  Factors Of Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count=0;
        
        for(int i=1;i<=number;i++)
        {
        	if(number%i==0)
        	{
        		System.out.print(i+" ");
        		count++;
        	}
        }
        System.out.println();
        System.out.print("Number of Factors Of "+number+"="+count);
	}

}
