package ArrayPrograms;

public class ReverseWordsSamePosition {

	public static void main(String[] args)
	{
		String str="My name is vicky";
		String[]words=str.split(" ");
		String rev=" ";
		for(int i=0;i<words.length;i++)
		{
			
			String word=words[i];
			String res=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				res=res+word.charAt(j);
			}
			rev=rev+res+" ";
			
		}
		System.out.println(rev.trim());
		

	}

}
