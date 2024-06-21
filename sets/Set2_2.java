import java.util.Scanner;

public class Set2_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the value for " + i + " : ");
            arr[i] = sc.nextInt();    
        }

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.print("Enter value for search : ");
        int k = sc.nextInt();

        int lb=0,ub=size-1,mid=-1,pos=-1;
        boolean found = false;

        while(found==false && lb<=ub)
        {
            mid = (lb+ub)/2;

            if(k==arr[mid])
            {
                found = true;
                break;
            }
            else
            {
                if(arr[mid]>k)
                    ub = mid - 1;
                else 
                    lb = mid + 1;
            }
        }

        if(found)
        {
            System.out.println(k + " is found at position " + mid);
        }
        else
        {
            System.out.println(k + " is not found");
        }
    }    
}
