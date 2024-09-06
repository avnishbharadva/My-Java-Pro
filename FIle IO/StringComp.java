// String Compression
import java.util.ArrayList;
import java.util.List;

public class StringComp {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
	List<Character> nc = new ArrayList<>();
	
	for(int i=0;i<chars.length;i++)
	{
		int count = 0;
		for(int j=0;j<chars.length;j++)
		{
			if(chars[j]==chars[i])
			{
				count++;
			}
		}
		nc.add(chars[i]);
		nc.add(Integer.toString(count));
		//System.out.println(chars[i] + " : " + count);
	}

        for (char c : nc) {
            System.out.print(c);
        }
    }
}
