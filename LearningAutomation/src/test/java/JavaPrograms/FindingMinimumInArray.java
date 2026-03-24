package JavaPrograms;

public class FindingMinimumInArray {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Minimum Element In Array");

		int[]a= {1,2,3,4,5};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
				
		}
		System.out.println("Minimum Element in an Array: "+min);

	}

}
