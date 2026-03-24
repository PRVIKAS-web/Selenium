package JavaPrograms;

public class FindingMaxValueFromOddIndexed {

	public static void main(String[] args) 
	{

		System.out.println("Program For Finding MaxValue From OddIndexed");

		int[]a= {1,2,3,4,5};
		int max=a[1];
		for(int i=0;i<a.length;i=i+2)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("MaxValue From OddIndexed= "+max);

	}

}
