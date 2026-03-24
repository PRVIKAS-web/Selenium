package ArrayPrograms;

public class FindingAvgSecondHalf {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Average From SecondHalfArray  ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			
			 sum=sum+a[i];
			
		}
		double avg=(double)sum/(a.length/2);
		System.out.println("Average From SecondHalfArray "+avg);

	}

}
