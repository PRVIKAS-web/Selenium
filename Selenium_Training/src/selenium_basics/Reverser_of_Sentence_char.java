package selenium_basics;

public class Reverser_of_Sentence_char {

	public static void main(String[] args) 
	{
		String s="Python Am Learning Automation";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);

	}

}
