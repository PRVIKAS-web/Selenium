package JavaGrooming;

import java.util.Scanner;

public class Productofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number::: ");
		int num=sc.nextInt();
		
		int product=1;
		while(num!=0)
		{
			int d=num%10;
			product=product*d;
			num=num/10;
		}
		System.out.println("product of digits is:: "+product);

	}

}
