package JavaPrograms;

public class FindingAvgerageOfArray {

	public static void main(String[] args) 
	{

		System.out.println("Program For Finding Average Of Array");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avearge=(double)sum/a.length;
		System.out.println("Average Of Array= "+avearge);

	}

}
