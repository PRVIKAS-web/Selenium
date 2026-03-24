package selenium_basics;

public class First_And_Last_Reverse {

	public static void main(String[] args) 
	{
		String s="Java Is Easy Language";
		String[] s1=s.split(" ");
		
		for(int i =0;i<s.length()-1;i++) 
		{
			
			if(i==0||i==s1.length-1)
			{
				String rev="";
				for(int j=0;j<s1[i].length();j++)
				{
					rev=s1[i].charAt(j)+rev;
				}
				s1[i]=rev;
			}
            
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}

}
