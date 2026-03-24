package ArrayPrograms;

public class FindingSumFirstHalf {

	public static void main(String[] args)
	{
		System.out.println("Program For Finding Sum From First Half From Array ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
			
			 sum=sum+a[i];
			
		}
		System.out.println("Sum From First Half From Array: " + sum);

	}

}
