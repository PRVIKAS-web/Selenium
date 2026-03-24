package ArrayPrograms;

public class ReadingOddIndexedReverse {

	public static void main(String[] args)
	{
		System.out.println("Program For Reading Even Indexed In Reverse  ");

		int[]a= {1,2,3,4,5};
		
		int start = (a.length - 1 % 2 != 0) ? a.length - 1 : a.length - 2;

        for (int i = start; i >= 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
		


	}
 
}
