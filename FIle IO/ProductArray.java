// Product of Array Except Self

public class ProductArray
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4};

		int a2[] = {1,1,1,1};
		
		//int i = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j==i)
				{
					continue;
				}
				else
				{
					//System.out.println(a2[c] + " : " + arr[j]);
					a2[i] = a2[i] * arr[j];
				}
			}
			//c++;
		}
		System.out.println();

		for(int i:a2)
		{	
			System.out.print(i + " , ");
		}
	}
}