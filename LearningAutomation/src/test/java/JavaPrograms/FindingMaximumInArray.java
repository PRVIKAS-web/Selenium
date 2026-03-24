package JavaPrograms;

public class FindingMaximumInArray {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Maximum Element In Array");

		int[]a= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
				
		}
		System.out.println("Maximum Element in an Array: "+max);

	}

}
