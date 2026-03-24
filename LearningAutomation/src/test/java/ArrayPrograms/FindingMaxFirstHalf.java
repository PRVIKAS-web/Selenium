package ArrayPrograms;

public class FindingMaxFirstHalf {

	public static void main(String[] args)
	{
		System.out.println("Program For Finding Maximum Element From FirstHalfArray");

		int[]a= {1,2,3,4,5};
		int max=a[0];
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]>max)
				max=a[i];
				
		}
		System.out.println("Maximum Element From FirstHalfArray "+max);
	}

}
