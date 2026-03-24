package JavaPrograms;

public class FindingMinValueFromEvenIndexed {

	public static void main(String[] args) 
	{

		System.out.println("Program For Finding MinValue From EvenIndexed");

		int[]a= {1,2,3,4,5};
		int min=a[0];
		for(int i=0;i<a.length;i=i+2)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("MinValue From EvenIndexed= "+min);

	}

}
