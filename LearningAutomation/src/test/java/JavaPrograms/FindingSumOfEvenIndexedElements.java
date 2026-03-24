package JavaPrograms;

public class FindingSumOfEvenIndexedElements {

	public static void main(String[] args) 
	{

		System.out.println("Program For Finding Sum Of Even Indexed Elements  ");

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			 sum=sum+a[i];
			}
		}
		System.out.println("Sum Of Even Indexed Elements= "+sum);
	}

}
