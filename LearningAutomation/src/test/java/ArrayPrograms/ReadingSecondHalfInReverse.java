package ArrayPrograms;

public class ReadingSecondHalfInReverse {

	public static void main(String[] args)
	{
		System.out.println("Program For Reading SecondHalf Elements In Reverse ");

		int[]a= {1,2,3,4,5};
		
		for(int i=a.length-1;i>=a.length/2;i--)
		{
			
			System.out.print(a[i] + " "); 
			
		}
		


	}

}
