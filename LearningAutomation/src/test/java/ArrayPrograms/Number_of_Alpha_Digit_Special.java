package ArrayPrograms;

public class Number_of_Alpha_Digit_Special {

	public static void main(String[] args)
	{
		String str="vicky@1234";
		int alpha=0,digit=0,special=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				digit++;
			}
			
			else if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z')
			{
				alpha++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("number of alphabets::"+alpha);
		System.out.println("number of digit::"+digit);
		System.out.println("number of special characters::"+special);



	}

}
