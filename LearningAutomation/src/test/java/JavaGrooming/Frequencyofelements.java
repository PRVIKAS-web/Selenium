package JavaGrooming;

public class Frequencyofelements
{

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,2,1};
		for(int i=0;i<=a.length-1;i++)
		{
			int count=1;
			int value=a[i];
			if(value!=-1)
			{
				for(int j=i+1;j<=a.length-1;j++)
				{
					if(value==a[j])
					{
						count++;
						a[j]=-1;
					}
				}
				System.out.println(value+"---->"+count);
			}
		}

	}

}
