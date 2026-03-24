package ArrayPrograms;

public class FindingMaxSecondHalf {

	public static void main(String[] args)
	{
		System.out.println("Program For Finding Maximum Element From SecondHalfArray");

		int[]a= {1,2,3,4,5};
		int max=a[0];
		for(int i=a.length/2;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
				
		}
		System.out.println("Maximum Element From SecondHalfArray "+max);
	}

}
