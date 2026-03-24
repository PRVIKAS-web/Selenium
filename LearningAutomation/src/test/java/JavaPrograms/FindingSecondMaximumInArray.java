package JavaPrograms;

public class FindingSecondMaximumInArray {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Second Minimum Element In Array");

		int[]a= {1,2,3,4,5};
		int firstmax=a[0];
		int secondmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstmax)
			{
				secondmax=firstmax;
			    firstmax=a[i];
			}
			else if(a[i] <firstmax && (secondmax == firstmax || a[i] < secondmax))
            {
                secondmax = a[i];
            }
			    
				
		}
		System.out.println("Second Maximum Element in an Array: "+secondmax);

	}

}
