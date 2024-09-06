// Reverse Words in a String
public class RevString
{
	public static void main(String args[])
	{
		String s = "radha krishan";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
	}
}