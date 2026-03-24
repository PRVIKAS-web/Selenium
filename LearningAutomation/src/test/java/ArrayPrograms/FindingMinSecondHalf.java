package ArrayPrograms;

public class FindingMinSecondHalf {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Minimum Element From Second HalfArray");

		int[]a= {1,2,3,4,5};
		int min=a[0];
		for(int i=a.length/2;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
				
		}
		System.out.println("Minimum Element From Second HalfArray: "+min);

	}

}
