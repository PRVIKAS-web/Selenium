package selenium_basics;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int n=10;
		int f0=0;
		int f1=1;
		int f2;
		System.out.print(f0+" "+f1+" ");
		for(int i=0;i<=n;i++)
		{
		  
		  f2=f0+f1;
		  System.out.print(f2+" ");
		  f0=f1;
		  f1=f2;
		}
	}

}
