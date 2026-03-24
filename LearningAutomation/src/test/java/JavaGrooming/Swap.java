package JavaGrooming;

public class Swap {

	public static void main(String[] args) 
	{
		int a=10;
		int b=50;
//		System.out.println("Before swapping");
//		System.out.println(a);
//		System.out.println(b);
//		
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping");
//		System.out.println(a);
//		System.out.println(b);
		
		//without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

		
		
		

	}

}
