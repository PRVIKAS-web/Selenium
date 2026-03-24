package selenium_basics;

public class Getting_Separate_String {

	public static void main(String[] args)
	{
		String s="VASDFicky@!#$";
		String specialcharacters=" ";
		String lowercase=" ";
		String uppercase=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				uppercase+=ch;
				
			}
			else if(ch>='a' && ch<='z')
			{
				lowercase+=ch;
			}
			else
			{
				specialcharacters+=ch;
			}
			
		}
		System.out.println(uppercase);
		System.out.println(lowercase);
		System.out.println(specialcharacters);

	}

}
