package ArrayPrograms;

public class ReadingEvenIndexed {

	public static void main(String[] args)
	{
		System.out.println("Program For Reading Even Indexed  ");

		int[]a= {1,2,3,4,5};
		
		for(int i=0;i<=a.length-1;i=i+2)
		{
			
			System.out.print(a[i] + " "); 
			
		}
		


	}

}
