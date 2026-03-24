package ArrayPrograms;

public class FindingSumSecondHalf {

	public static void main(String[] args)
	{
		System.out.println("Program For Finding Sum From Second Half From Array ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			
			 sum=sum+a[i];
			
		}
		System.out.println("Sum From Second Half From Array: " + sum);

	}

}
