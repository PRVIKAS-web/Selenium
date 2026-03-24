package ArrayPrograms;

public class FindingMinFirstHalf {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Minimum Element From First HalfArray");

		int[]a= {1,2,3,4,5};
		int min=a[0];
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]<min)
				min=a[i];
				
		}
		System.out.println("Minimum Element From First HalfArray: "+min);

	}

}
