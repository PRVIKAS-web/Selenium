package JavaPrograms;

import java.util.Scanner;

public class PrintingCountOfDigits {

	public static void main(String[] args) 
	{
        System.out.println("Program For Printing Count Of All Digits  in a Number");
		
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count=0;
       if(number==0)
       {
    	   count=1;
       }
       else
       {
    	        while(number>0)
           {
           	 
           	 number=number/10; 
           	 count++;
           }
    	   
       }
        
        System.out.println(count);


	}

}
