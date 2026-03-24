package ArrayPrograms;

public class FindoutIndexofSpecified {

	public static void main(String[] args)
	{
		System.out.println("Program For Findout Indexof Specified Element ");

		int[]a= {1,2,3,4,5};
		
		int target = 1;

        int index = -1; 

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == target) 
            {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }

	

}
