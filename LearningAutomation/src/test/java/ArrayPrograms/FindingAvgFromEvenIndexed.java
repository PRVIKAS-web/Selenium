package ArrayPrograms;

public class FindingAvgFromEvenIndexed {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Average From Even Indexed Elements  ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			 sum=sum+a[i];
			}
		}
		double avg=(double)sum/a.length;
		System.out.println("Average Of Even Indexed Elements= "+avg);

	}

}
