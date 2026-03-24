package selenium_basics;

public class Reverse_Of_Sentence {

	public static void main(String[] args)
	{
		String s="I am Learning Automation";
		String[] s1=s.split(" ");
		
		for(int i = s1.length - 1; i >= 0; i--) 
		{
            System.out.print(s1[i] + " ");
		}
		
		
		
		

	}

}
