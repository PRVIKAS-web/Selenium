package ArrayPrograms;

public class ReadingFirstHalfInReverse {

	public static void main(String[] args)
	{
		System.out.println("Program For Reading FirstHalf Elements In Reverse ");

		int[]a= {1,2,3,4,5};
		
		for(int i=a.length/2;i>=0;i--)
		{
			
			System.out.print(a[i] + " "); 
			
		}
		


	}

}
