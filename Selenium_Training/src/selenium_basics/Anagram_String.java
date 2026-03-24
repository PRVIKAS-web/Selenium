package selenium_basics;

public class Anagram_String {

	public static void main(String[] args) 
	{
		String s1="eat";
		String s2="see";
		int c1=0;
		int c2=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			for(int j=0;j<s1.length();j++)
			{
				if (s1.charAt(j) == ch) 
				{
                    c1++;
                }
			}
			for (int j = 0; j < s2.length(); j++) 
			{
                if (s2.charAt(j) == ch) 
                {
                    c2++;
                }
            }
			
		}
		if(c1==c2)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

			
		

	}

}
