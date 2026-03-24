package JavaPrograms;

public class FindingSecondMinimumInArray {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Second Minimum Element In Array");

		int[]a= {1,2,3,4,5};
		int firstmin=a[0];
		int secondmin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstmin)
			{
				secondmin=firstmin;
			    firstmin=a[i];
			}
			else if(a[i] > firstmin && (secondmin == firstmin || a[i] < secondmin))
            {
                secondmin = a[i];
            }
			    
				
		}
		System.out.println("Second Minimum Element in an Array: "+secondmin);

	}

}
