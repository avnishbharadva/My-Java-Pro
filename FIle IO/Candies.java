//Kids With the Greatest Number of Candies

public class Candies
{
	public static void main(String args[])
	{	
		int arr[] = {4,2,1,1,2};
		int a2[] = new int[5];
		int max = 0;
		int mc = 1;

		for(int i=0;i<5;i++)
		{
			a2[i] = arr[i] + mc;
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		//System.out.println(max);
		for(int i=0;i<5;i++)
		{
			a2[i] = arr[i] + mc;
		}
		for(int i=0;i<5;i++)
		{
			if(a2[i]>=max)
				System.out.print("true, ");
			else
				System.out.print("false, ");
		}

	}
}