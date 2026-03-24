package selenium_basics;

public class Reverse_of_String {

	public static void main(String[] args) 
	{
		String s="Vicky";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);

	}

}
