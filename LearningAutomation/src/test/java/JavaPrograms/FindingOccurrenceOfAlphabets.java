package JavaPrograms;

public class FindingOccurrenceOfAlphabets 
{

	public static void main(String[] args) 
	{
		System.out.println("Program For Finding Occurrence Of Alphabets In a String ");
		String name="vickyv";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			int count=0;
			boolean alreadyVisited = false;
			for(int k = 0; k < i; k++)
			{
				if(ch == name.charAt(k))
				{
					alreadyVisited = true;
					break;
				}
			}

			if(alreadyVisited)
				continue;
			for(int j=0;j<name.length();j++)
			{
				if(ch==name.charAt(j))
				{
					count++;
				}
				
			}
			System.out.println("Occurrence Of "+ch + " = " + count);
		}
		

	}

}
