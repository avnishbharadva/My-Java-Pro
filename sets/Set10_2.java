import java.util.Scanner;

public class Set10_2 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter value for " + i + " : ");
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
    }
}
