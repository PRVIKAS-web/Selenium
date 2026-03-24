package ArrayPrograms;

public class FindingAvgFromOddIndexed {

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Average From Odd Indexed Elements  ");

        int[] a = {10, 20, 30, 40, 50, 60};
        
        int sum = 0;
        int count = 0;
        for(int i = 1; i < a.length; i=i+2) 
        {
            sum = sum + a[i];
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("Average of odd indexed elements: " + avg);

	}

}
