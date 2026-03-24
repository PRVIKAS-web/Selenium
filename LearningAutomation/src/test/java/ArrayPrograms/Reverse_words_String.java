package ArrayPrograms;

public class Reverse_words_String
{

	public static void main(String[] args)
	{

		String str="My name is vicky"; 
		String[]words=str.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			
			String res="";
			String word=words[i];
			if(word.equals("name"))
			{
				for(int j=word.length()-1;j>=0;j--)
				{
					res=res+word.charAt(j);
				}
				
				res = res + " ";
			}
			
			else
			{
				res=word+" ";
			}
			rev=res+rev+" ";
			
		}
		System.out.println(rev.trim());

	}

}
