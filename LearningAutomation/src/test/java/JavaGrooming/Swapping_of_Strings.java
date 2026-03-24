package JavaGrooming;

public class Swapping_of_Strings {

	public static void main(String[] args) 
	{
		String s1="vicky";
		String s2="seethu";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		//reverse each character
		String str="My name is Bittu";
		String rev=" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		//reverse word
		String[] words=str.split(" ");
		String rev1=" ";
		for(int i=0;i<words.length;i++)
		{
			rev1=words[i]+" "+rev1;
		}
		System.out.println(rev1);
		
		
		

	}

}
