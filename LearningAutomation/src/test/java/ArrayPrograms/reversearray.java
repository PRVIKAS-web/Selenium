package ArrayPrograms;

public class reversearray {

	public static void main(String[] args)
	{
		int []a= {1,2,3,4,5};
		//using extra array
//		int []rev=new int[a.length];
//		int last=rev.length-1;
//		for(int i=0;i<=a.length-1;i++)
//		{
//			rev[last--]=a[i];
//		}
//		for(int arr:a)
//		{
//			System.out.print(arr+" ");
//		}
//		
//		System.out.println();
//		for(int e:rev)
//		{
//			System.out.print(e+" ");
//		}
		
		//using without extra array
		int last=a.length-1;
		for(int i=0;i<=a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[last];
			a[last]=temp;
			last--;
		}

		
		for(int arr:a)
			{
				System.out.print(arr+" ");
			}
			
			System.out.println();
			for(int e:a)
			{
				System.out.print(e+" ");
			}
		
		
	}

}
