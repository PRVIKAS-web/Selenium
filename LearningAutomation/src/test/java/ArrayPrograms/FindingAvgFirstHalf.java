package ArrayPrograms;

public class FindingAvgFirstHalf {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Average From FirstHalfArray  ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
			
			 sum=sum+a[i];
			
		}
		double avg=(double)sum/(a.length/2);
		System.out.println("Average From FirstHalfArray "+avg);

	}

}
