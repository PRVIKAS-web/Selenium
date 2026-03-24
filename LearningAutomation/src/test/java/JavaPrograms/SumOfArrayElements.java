package JavaPrograms;

public class SumOfArrayElements {

	public static void main(String[] args) 
	{
		System.out.println("Program For Sum Of ArrayElements");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum Of ArrayElements= "+sum);
	}

}
